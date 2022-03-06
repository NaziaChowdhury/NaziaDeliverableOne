import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		System.out.println(
				"Hello! Please create a password. The password must contain:\n" + "○ At least one lowercase letter\n"
						+ "○ At least one uppercase letter\n" + "○ At least minimum 7 characters\n"
						+ "○ At least maximum 12 characters\n" + "○ An exclamation point: !");

		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();

		if (password.length() >= 7 && password.length() <= 12) {
			System.out.println("Password valid and accepted");
		} else {
			System.out.println("Error");
		}

	}

}
