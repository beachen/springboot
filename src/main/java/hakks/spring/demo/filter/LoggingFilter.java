package hakks.spring.demo.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * @author Anders Strand
 */
@Provider
@PreMatching
public class LoggingFilter implements ContainerResponseFilter, ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext requestCtx, ContainerResponseContext responseCtx) throws IOException {

		System.out.println(
				"RESPONSE: " +
				"status: " + responseCtx.getStatus() +
				"data:" + responseCtx.getEntity());
	}

	@Override
	public void filter(ContainerRequestContext requestCtx) throws IOException {

		System.out.println(
			"REQUEST: " +
			requestCtx.getMethod() + ":" + requestCtx.getUriInfo().getPath());
	}
}
