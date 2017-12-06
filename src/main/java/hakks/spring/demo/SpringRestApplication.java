package hakks.spring.demo;

import hakks.spring.demo.resource.TwitterResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringRestApplication {

	public static void main(String[] args) {


		SpringApplication.run(SpringRestApplication.class, args);
	}

}
