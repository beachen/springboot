package beachen.spring.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author Anders Strand
 */
public class DefaulExceptionMapper implements ExceptionMapper<RuntimeException> {

	@Override
	public Response toResponse(RuntimeException e) {

		return Response.serverError().entity("Default exception").build();
	}
}
