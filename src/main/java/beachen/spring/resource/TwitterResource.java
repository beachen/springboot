package beachen.spring.resource;

import beachen.spring.model.Tweet;
import beachen.spring.service.TwitterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
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

	private static final Logger LOG = LoggerFactory.getLogger(TwitterResource.class.getName());

	private final TwitterService service;

	@Inject
	public TwitterResource(TwitterService service) {

		this.service = service;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/hello")
	public Response hello(){

		LOG.info("Hello Twitter Resource");
		Tweet tweet = service.getLatestTweet();

		return Response.ok(tweet).build();
	}

}
