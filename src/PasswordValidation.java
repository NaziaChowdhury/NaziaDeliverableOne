import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		System.out.println(
				"Hello! Please create a password. The password must contain:\n" + "○ At least one lowercase letter\n"
						+ "○ At least one uppercase letter\n" + "○ At least minimum 7 characters\n"
						+ "○ At least maximum 12 characters\n" + "○ An exclamation point: !");

		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();

		if (password.length() >= 7 && password.length() <= 12 && password.contains("!") && passwordContainsLowerAndUpperCase(password)) {
			System.out.println("Password valid and accepted");
		} else {
			System.out.println("Error");
		}

	}

	public static boolean passwordContainsLowerAndUpperCase(String password) {
		boolean containsLowerCase = false;
		boolean containsUpperCase = false;

		for (int i = 0; i < password.length(); i++) {

			char character = password.charAt(i);

			if (Character.isLowerCase(character)) {
				containsLowerCase = true;
			}

			if (Character.isUpperCase(character)) {
				containsUpperCase = true;
			}
			
			if (containsLowerCase && containsUpperCase) {
				break;
			}

		}

		if (containsLowerCase && containsUpperCase) {
			return true;
		} else {
			return false;
		}
	}

}
