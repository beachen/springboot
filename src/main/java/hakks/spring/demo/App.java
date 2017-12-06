package hakks.spring.demo;

import hakks.spring.demo.exception.MyExceptionMapper;
import hakks.spring.demo.filter.LoggingFilter;
import hakks.spring.demo.resource.TwitterResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

/**
 * @author Anders Strand
 */
@Component
@ApplicationPath("/api")
public class App extends ResourceConfig{

	@PostConstruct
	private void init() {

		// Rest endpoints
		packages(getClass().getPackage().getName() + ".resource");

		// Exception handling
		registerClasses(MyExceptionMapper.class);

		// Logging filter
		registerClasses(LoggingFilter.class);

	}

}
