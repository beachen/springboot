package beachen.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Anders Strand
 */
public class Tweet {

	@NotNull(message = "User name can not be null")
	private String userName;


	@Size(min=10, max=240, message = "Min length of message is {min} and max is {max}")
	private String message;

	public String getUserName() {

		return userName;
	}

	public void setUserName(String userName) {

		this.userName = userName;
	}

	public String getMessage() {

		return message;
	}

	public void setMessage(String message) {

		this.message = message;
	}

	@Override
	public String toString() {

		return "Tweet{" +
			"userName='" + userName + '\'' +
			", message='" + message + '\'' +
			'}';
	}
}
