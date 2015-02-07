import java.util.Scanner; //Allows for keyboard input

public class UserAuthConsole {
	public static String correctUsername = "Tanes";
	public static String correctPassword = "1234";
	public static String username;
	public static String password;
	public static boolean userStatus, passwordStatus;
//	private static boolean consoleOption, paneOption;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username ");
		username = scanner.next();
		
		if(userAuthentication(username)==true) {
			System.out.println("Enter password ");
			password= scanner.next();
			
			if(passwordAuthentication(password)==true) {
				System.out.println("Welcome " + username + ".");
			} else {
				System.out.println("Incorrect password.");
			}
		} else {
			System.out.println("Incorrect username.");
		}
		
		scanner.close();
	}

	public static boolean userAuthentication(String username) {
		
		userStatus = false;
		if (username.equalsIgnoreCase(correctUsername)) {
			userStatus = true;
		} else {
			userStatus = false;
		}
		return userStatus;
	}
	
	public static boolean passwordAuthentication(String password) {
		
		passwordStatus = false;
		if (password.equals(correctPassword)) {
			passwordStatus = true;
		} else {
			passwordStatus = false;
		}
		return passwordStatus;
	}
}