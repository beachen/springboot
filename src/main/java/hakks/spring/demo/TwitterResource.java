package hakks.spring.demo;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.twitter.api.CursoredList;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.TwitterProfile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.ws.rs.GET;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Anders Strand
 */
@RestController
public class TwitterResource {

	private Twitter twitter;

	private ConnectionRepository connectionRepository;

	/**
	@Inject
	public TwitterResource(Twitter twitter, ConnectionRepository connectionRepository) {
		this.twitter = twitter;
		this.connectionRepository = connectionRepository;
	} **/

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public List<String> hello(){

		return Arrays.asList("Hello");
	}

}
