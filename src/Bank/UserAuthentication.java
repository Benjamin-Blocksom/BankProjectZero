package Bank;
import java.util.Scanner;

public class UserAuthentication {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String username, password;

System.out.print("Username: ");
username = input.nextLine();

System.out.print("Password: ");
password = input.nextLine();

input.close();

// test with hardcoded values
if (username.equals("username") && password.equals("password")){
  System.out.println("Authentication verified");
  } else {
      System.out.println("Login unsuccessful.");
    }
  }
}
