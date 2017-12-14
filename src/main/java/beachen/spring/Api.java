package beachen.spring;

import beachen.spring.exception.DefaulExceptionMapper;
import beachen.spring.exception.ValidationExceptionMapper;
import beachen.spring.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * @author Anders Strand
 */
@Component
@ApplicationPath("/api")
public class Api extends ResourceConfig{

	@PostConstruct
	private void init() {

		// Rest endpoints
		packages(getClass().getPackage().getName() + ".resource");

		// Exception handling
		registerClasses(
			ValidationExceptionMapper.class,
			DefaulExceptionMapper.class);

		// Logging filter
		registerClasses(LoggingFilter.class);

	}

}
