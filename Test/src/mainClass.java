import java.util.Scanner;

/**
 * average of 5 numbers
 * author: BinhAn
 */
public class mainClass {
	public static void main(String[] args) {
		final int QUANTITY = 5;
		int numb1,
			numb2,
			numb3,
			numb4,
			numb5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		numb1 = EnterNumber(sc);
		System.out.println("Enter 2nd number: ");
		numb2 = EnterNumber(sc);
		System.out.println("Enter 3rd number: ");
		numb3 = EnterNumber(sc);
		System.out.println("Enter 4th number: ");
		numb4 = EnterNumber(sc);
		System.out.println("Enter 5th number: ");
		numb5 = EnterNumber(sc);
		
		float averageOf5Number = ((float)(numb1 + numb2 + numb3 + numb4 + numb5))/QUANTITY;
		
		System.out.println("Result: " + averageOf5Number);
	}

	private static int EnterNumber(Scanner sc) {
		int numberinput;
		while(true) {
			try {
				String stringInput = sc.nextLine();
				numberinput = Integer.parseInt(stringInput);
				break;
			} catch (NumberFormatException e) {
				System.err.println("Incorrect fortmat\nPlease re-enter: ");
			}
		}
		return numberinput;
	}
}

