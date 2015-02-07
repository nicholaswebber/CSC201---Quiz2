import javax.swing.JOptionPane;

public class UserAuthPane {

	public static String username;
	public static String password;
	public static boolean userStatus, passwordStatus;
	
//	private UserAuthConsole authorization1 = new UserAuthConsole();

	public static void main(String[] args) {

		username = JOptionPane.showInputDialog("Enter username.");
		if (UserAuthConsole.userAuthentication(username)==true) {
			password = JOptionPane.showInputDialog("Enter password.");
			if (UserAuthConsole.passwordAuthentication(password)==true) {
				JOptionPane.showMessageDialog(null, "Welcome " + username);
			} else {
				JOptionPane.showMessageDialog(null, "Invalid Password");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Username");
		}
	}
}