package exceptionHandling;

public class Try {
	public void authenticate(String login)throws 
	LoginException{
		User u = User.get(login);
		if (u == null){
			throw new LoginException();
		}
	}
}
