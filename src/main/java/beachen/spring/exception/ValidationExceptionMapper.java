package beachen.spring.exception;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.stream.Collectors;

/**
 * @author Anders Strand
 */
@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	@Override
	public Response toResponse(ConstraintViolationException e) {

		String res = e.getConstraintViolations().stream()
			.map(ConstraintViolation::getMessage)
			.collect(Collectors.joining(","));

		System.out.println("Error:" + e.getMessage());
		return Response
			.status(Response.Status.BAD_REQUEST)
			.type(MediaType.APPLICATION_JSON)
			.entity(String.format("{name:%s}", res))
			.build();
	}


}
