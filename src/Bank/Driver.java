package Bank;

public class Driver {

	public static void main(String[] args) {
		
		// Create a first customer
		Account user1 = new Account();
		user1.deposit(1.42);
		 
		// Create a first customer
		Account user2 = new Account();
		user2.deposit(42.1000000001);
		
		System.out.println(user1.getBalance());
		System.out.println(user2.getBalance());
		
		// instantiate userAuthentication object
		UserAuthentication myUserAuthentication = new UserAuthentication();
		myUserAuthentication();
		 		 
	}
}
