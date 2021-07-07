import java.util.Scanner;

public class PlayerSelection {
	Scanner input = new Scanner(System.in);
	private static boolean isValid = true;

	public static void main(String[] args) {

	}

	private void DisplayMenu() {
		while (isValid) {
			String menu = "Player Selection Program".concat("Enter A to Add Player")
					.concat("Enter V to View Alla Players")
					.concat("Enter T to Display Best Batsmans")
					.concat("Enter W to Display Best Bowlers")
					.concat("Enter K to Display Best Keeper").concat("Choose Option: ");
			boolean hasNext = input.hasNext();
			if (hasNext) {
			}
		}
		System.out.println("Exiting Program...");
	}

	private static void mainMenuInputValidation(String code) {
		String[] validInputArray = {}
	}
}