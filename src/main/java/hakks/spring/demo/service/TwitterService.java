package hakks.spring.demo.service;

import hakks.spring.demo.model.Tweet;
import hakks.spring.demo.resource.TwitterResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author Anders Strand
 */
@Service
public class TwitterService {


	private static final Logger LOG = LoggerFactory.getLogger(TwitterService.class.getName());

	public Tweet getLatestTweet(){

		Tweet tweet = new Tweet();
		tweet.setMessage("Hello");
		tweet.setUserName("Anders");

		LOG.info("Hello twitter service");

		return tweet;

	}
}
