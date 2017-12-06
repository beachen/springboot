package hakks.spring.demo.resource;

import hakks.spring.demo.model.Tweet;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Anders Strand
 */
@Component
@Path("/twitter")
public class TwitterResource {


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hello")
	public Response hello(){

		Tweet tweet = new Tweet();
		tweet.setMessage("Hello");
		tweet.setUserName("Anders");


		return Response.ok(tweet).build();
	}

}
