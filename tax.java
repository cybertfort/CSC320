import java.util.Scanner;
public class Tax_Withholding {

	public static void main(String[] args) {
		//Create scanner object for input
		Scanner scanner = new Scanner(System.in);
		
		//Prompt user to enter their weekly income
		System.out.println("Enter your weekly income: ");
		double weeklyIncome = scanner.nextFloat();
		//close scanner
		scanner.close();
		
		//initialize the variable for tax withholding
		double taxWithholding = 0; 
		
		//Calculate tax withholding based on income brackets
		if (weeklyIncome < 500) {
			//10% withholding for incomes less that $500
			taxWithholding = weeklyIncome * 0.10;
		} else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
			//15% withholding for incomes between $500 and $1500
			taxWithholding = weeklyIncome * 0.15;
		} else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
			//20% withholding for incomes between $1500 and $2500
			taxWithholding = weeklyIncome * 0.20;
		} else {
			//25% withholding for incomes above $2500
			taxWithholding = weeklyIncome * 0.25;
		}
		//Displaying tax withholding to the user
		System.out.println("Your estimated weekly tax withholding is: " + taxWithholding);
	}

}
