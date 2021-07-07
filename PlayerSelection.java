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
					.concat("Enter B to Display Best Batsmans")
					.concat("Enter C to Display Best Bowlers")
					.concat("Enter D to Display Best Keeper").concat("Choose Option: ");
			boolean hasNext = input.hasNext();
			if (hasNext) {
			}
		}
		System.out.println("Exiting Program...");
	}

	private static void mainMenuInputValidation(String code) {
		boolean validInput = false;
		String[] validInputArray = { "A", "V", "B", "C", "D" };
		int index = 0;

		for (int i = 0; i < validInputArray.length; i++) {
			if (code.equals(validInputArray[i])) {
				validInput = true;
				index = i;
			}
		}

		if (validInput) {
			switch (index) {
				case value:

					break;

				default:
					break;
			}
		}

	}
}