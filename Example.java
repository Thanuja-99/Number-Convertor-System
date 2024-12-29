import java.util.Scanner;

class Example {
	public static void main(String args[]) {

		Scanner Input = new Scanner(System.in);

		int Decimal_Number = 0;
		int Binary_Number = 0;
		int Octal_Number = 0;
		int Hexadecimal_Number = 0;
		int roman_option = 0;
		int Roman_Number = 0;
		char userInput;
		int binaryNumber;
		int decimalNumber;
		int rem;
		String hexStr = "";
		String octalStr = "";
		// int decimalValues;

		System.out.println("                                              __  ______              __");
		System.out.println("                                             |  \\/      \\            |  \\ ");
		System.out.println("                                              \\$$|  $$$$$\\   ______  | $$  _______");
		System.out.println("                                             |  \\| $$  \\$$  |      \\ | $$ /       \\ ");
		System.out.println("                                             | $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
		System.out.println("                                             | $$| $$   __  /      $$| $$| $$");
		System.out.println("                                             | $$| $$__/  \\|  $$$$$$$| $$| $$_____");
		System.out.println("                                             | $$|\\$$    $$ \\$$    $$| $$ \\$$     \\ ");
		System.out.println("                                              \\$$  \\$$$$$$   \\$$$$$$$\\$$   \\$$$$$$$");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"    _   _                          _                            _____                                            _     ");
		System.out.println(
				"   | \\ | |                        | |                          / ____|                                          | |    ");
		System.out.println(
				"   |  \\| |   _   _    _ __ ___    | |__      ___    _ __      | |        ___     _ __   __   __   ___    _ __   | |_     ___    _ __");
		System.out.println(
				"   | . ` |  | | | |  | `_ ` _ \\   | `_ \\    / _ \\  | `__|     | |       / _ \\   | `_ \\  \\ \\ / /  / _ \\  | `__|  | __|   / _ \\  | `__|");
		System.out.println(
				"   | |\\  |  | |_| |  | | | | | |  | |_) |  |  __/  | |        | |____  | ( ) |  | | | |  \\ v /  |  __/  | |     | |_   |  __/  | |");
		System.out.println(
				"   |_| \\_|   \\__,_|  |_| |_| |_|  |_.__/    \\___|  |_|         \\_____|  \\___/   |_| |_|   \\_/    \\___|  |_|      \\__|   \\___|  |_|");
		System.out.println("");
		System.out.println("");

		System.out.println(
				"============================================================================================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("          [01]  Decimal Converter ");
		System.out.println("");
		System.out.println("          [02]  Binary Converter ");
		System.out.println("");
		System.out.println("          [03]  Octal Converter ");
		System.out.println("");
		System.out.println("          [04]  Hexadecimal Converter ");
		System.out.println("");
		System.out.println("          [05]  Roman Number Converter ");
		System.out.println("");
		System.out.println("");

		System.out.print("Enter Option  -> ");
		int number = Input.nextInt();
		Input.nextLine();

		if (number == 1) {
			System.out.println("+------------------------------------------------------------------+");
			System.out.println("|                           Decimal Converter                      |");
			System.out.println("+------------------------------------------------------------------+");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.print("Enter a Decimal number : ");
			Decimal_Number = Input.nextInt();
			int Original_Number = Decimal_Number;

			if (Decimal_Number > 0) {
				System.out.print("Binary number : ");
				String binaryStr = "";
				while (Decimal_Number != 0) {
					Binary_Number = Decimal_Number % 2;
					Decimal_Number /= 2;
					binaryStr = Binary_Number + binaryStr;
				}
				System.out.print(binaryStr);
				System.out.println();

				Decimal_Number = Original_Number;
				System.out.print("Octal number : ");

				while (Decimal_Number != 0) {
					Octal_Number = Decimal_Number % 8;
					Decimal_Number /= 8;
					octalStr = Octal_Number + octalStr;
				}
				System.out.print(octalStr);
				System.out.println();

				Decimal_Number = Original_Number;
				System.out.print("Hexadecimal number : ");

				while (Decimal_Number != 0) {
					Hexadecimal_Number = Decimal_Number % 16;
					Decimal_Number /= 16;
					if (Hexadecimal_Number < 10)
						hexStr = Hexadecimal_Number + hexStr;
					else
						hexStr = (char) (Hexadecimal_Number + 55) + hexStr;
				}
				System.out.print(hexStr);

				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to go to the home page (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Redirecting to the home page...");

				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Stay on the current page...");
					Input.close();
				}

			}

			else {
				System.out.println("                 Invalid input........");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to input number again (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Input Number Agin ");

				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Redirecting to the home page...");
				}
			}

		}

		if (number == 2) {
			System.out.println("+------------------------------------------------------------------+");
			System.out.println("|                           Binary Converter                       |");
			System.out.println("+------------------------------------------------------------------+");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.print("Enter a Binary number: ");
			binaryNumber = Input.nextInt();

			if (Integer.toString(binaryNumber).matches("[01]+")) {
				decimalNumber = 0;
				int i = 0;
				while (binaryNumber != 0) {
					rem = binaryNumber % 10;
					decimalNumber += rem * Math.pow(2, i);
					binaryNumber /= 10;
					i++;
				}
				System.out.println("Decimal Number: " + decimalNumber);

				int temp = decimalNumber;
				while (temp != 0) {
					Octal_Number = temp % 8;
					temp /= 8;
					octalStr = Octal_Number + octalStr;
				}
				System.out.println("Octal Number: " + octalStr);

				temp = decimalNumber;
				while (temp != 0) {
					Hexadecimal_Number = temp % 16;
					temp /= 16;
					if (Hexadecimal_Number < 10)
						hexStr = Hexadecimal_Number + hexStr;
					else
						hexStr = (char) (Hexadecimal_Number + 55) + hexStr;
				}
				System.out.println("Hexadecimal Number: " + hexStr);
				System.out.print(hexStr);

				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to go to the home page (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Redirecting to the home page...");

				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Stay on the current page...");
					Input.close();
				}
			} else {
				System.out.println("                 Invalid input........");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to input number again (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Input Number Agin ");

				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Redirecting to the home page...");
				}
			}

		}

		if (number == 3) {
			System.out.println("+------------------------------------------------------------------+");
			System.out.println("|                           Octal  Converter                       |");
			System.out.println("+------------------------------------------------------------------+");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.print("Enter an Octal number : ");
			Octal_Number = Input.nextInt();

			if (Integer.toString(Octal_Number).matches("[01234567]+")) {
				decimalNumber = 0;
				int i = 0;
				while (Octal_Number != 0) {
					rem = Octal_Number % 10;
					decimalNumber += rem * Math.pow(8, i);
					Octal_Number /= 10;
					i++;
				}
				System.out.println("Decimal Number: " + decimalNumber);

				String binaryStr = "";
				int tempDecimal = decimalNumber;
				while (tempDecimal != 0) {
					Binary_Number = tempDecimal % 2;
					binaryStr = Binary_Number + binaryStr;
					tempDecimal /= 2;
				}
				System.out.println("Binary number : " + binaryStr);

				hexStr = "";
				tempDecimal = decimalNumber;
				while (tempDecimal != 0) {
					Hexadecimal_Number = tempDecimal % 16;
					if (Hexadecimal_Number < 10)
						hexStr = Hexadecimal_Number + hexStr;
					else
						hexStr = (char) (Hexadecimal_Number + 55) + hexStr;
					tempDecimal /= 16;
				}
				System.out.println("Hexadecimal number : " + hexStr);

				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to go to the home page (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Redirecting to the home page...");
				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Stay on the current page...");
					Input.close();
				}
			} else {
				System.out.println("Invalid input........");
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to input number again (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Input Number Again ");
				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Redirecting to the home page...");
				}
			}
		}

		if (number == 4) {
			System.out.println("+------------------------------------------------------------------+");
			System.out.println("|                      HexaDecimal  Converter                       |");
			System.out.println("+------------------------------------------------------------------+");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.print("Enter a hexadecimal number: ");
			String hexNumber = Input.nextLine();

			decimalNumber = 0;
			int length = hexNumber.length();

			for (int i = 0; i < length; i++) {
				char hexChar = hexNumber.charAt(length - 1 - i);
				int hexDigitValue = 0;

				if (hexChar >= '0' && hexChar <= '9') {
					hexDigitValue = hexChar - '0';
				} else if (hexChar >= 'A' && hexChar <= 'F') {
					hexDigitValue = hexChar - 'A' + 10;
				} else if (hexChar >= 'a' && hexChar <= 'f') {
					hexDigitValue = hexChar - 'a' + 10;
				} else {
					System.out.println("Invalid hexadecimal digit: " + hexChar);
					return; // Exit the program if input is invalid
				}

				decimalNumber += hexDigitValue * Math.pow(16, i);
			}

			System.out.println("Decimal equivalent: " + decimalNumber);

			String binaryStr = "";
			int tempDecimal = decimalNumber;
			while (tempDecimal != 0) {
				Binary_Number = tempDecimal % 2;
				binaryStr = Binary_Number + binaryStr;
				tempDecimal /= 2;
			}
			System.out.println("Binary number : " + binaryStr);

			int temp = decimalNumber;
			while (temp != 0) {
				Octal_Number = temp % 8;
				temp /= 8;
				octalStr = Octal_Number + octalStr;
			}
			System.out.println("Octal Number: " + octalStr);

			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Do you want to input number again (Y/N)? ");
			userInput = Input.next().charAt(0);

			if (Character.toUpperCase(userInput) == 'Y') {
				System.out.println("Redirecting to the home page...");
			} else if (Character.toUpperCase(userInput) == 'N') {
				System.out.println("Exist");
			}

		}

		if (number == 5) {
			System.out.println("+------------------------------------------------------------------+");
			System.out.println("|             Roman Number  Converter                              |");
			System.out.println("+------------------------------------------------------------------+");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.println("            [01] Decimal Number to Roman Number Converter ");
			System.out.println("            [02] Roman Number to Decimal Number Converter  ");
			System.out.println(" ");
			System.out.println(" ");

			System.out.print("Enter an Option: ");
			roman_option = Input.nextInt();
			Input.nextLine();

			if (roman_option == 1) {
				System.out.println("+------------------------------------------------------------------+");
				System.out.println("|            Decimal Number to Roman Number Converter              |");
				System.out.println("+------------------------------------------------------------------+");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");

				System.out.print("Enter a decimal number: ");
				decimalNumber = Input.nextInt();

				if (decimalNumber < 1 || decimalNumber > 3999) {
					System.out.println("Please enter a decimal number between 1 and 3999.");
				} else {
					String romanNumeral = "";
					int[] decimalValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
					String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

					for (int i = 0; i < decimalValues.length; i++) {

						while (decimalNumber >= decimalValues[i]) {
							romanNumeral += romanSymbols[i];
							decimalNumber -= decimalValues[i];
						}
					}

					System.out.println("The Roman numeral for is: " + romanNumeral);
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Do you want to input number again (Y/N)? ");
					userInput = Input.next().charAt(0);

					if (Character.toUpperCase(userInput) == 'Y') {
						System.out.println("Redirecting to the home page...");
					} else if (Character.toUpperCase(userInput) == 'N') {
						System.out.println("Exist");
					}

				}

			} else if (roman_option == 2) {

				System.out.println("+------------------------------------------------------------------+");
				System.out.println("|            Roman Number to Decimal Number Converter              |");
				System.out.println("+------------------------------------------------------------------+");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");

				System.out.print("Enter a Roman numeral: ");
				String romanNumeral = Input.nextLine().toUpperCase();

				decimalNumber = 0;

				for (int i = 0; i < romanNumeral.length(); i++) {
					char currentSymbol = romanNumeral.charAt(i);

					if (currentSymbol == 'I') {
						decimalNumber += 1;
					} else if (currentSymbol == 'V') {
						decimalNumber += 5;
					} else if (currentSymbol == 'X') {
						decimalNumber += 10;
					} else if (currentSymbol == 'L') {
						decimalNumber += 50;
					} else if (currentSymbol == 'C') {
						decimalNumber += 100;
					} else if (currentSymbol == 'D') {
						decimalNumber += 500;
					} else if (currentSymbol == 'M') {
						decimalNumber += 1000;
					} else {
						System.out.println("Invalid Roman numeral: " + romanNumeral);
						return; // Exit the program if input is invalid
					}
				}

				System.out.println("The decimal equivalent of " + romanNumeral + " is: " + decimalNumber);

				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Do you want to input number again (Y/N)? ");
				userInput = Input.next().charAt(0);

				if (Character.toUpperCase(userInput) == 'Y') {
					System.out.println("Redirecting to the home page...");
				} else if (Character.toUpperCase(userInput) == 'N') {
					System.out.println("Exist");
				}
			}
		}
	}
}
