package beachen.spring.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Anders Strand
 */
@Provider
public class MyExceptionMapper implements ExceptionMapper<RuntimeException> {

	@Override
	public Response toResponse(RuntimeException e) {

		return Response.serverError().entity(e.getMessage()).build();
	}


}
