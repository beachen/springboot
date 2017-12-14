package beachen.spring.model;

/**
 * @author Anders Strand
 */
public class Tweet {

	private String userName;
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
