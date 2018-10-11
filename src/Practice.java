import java.util.Scanner;

public class Practice 
{

	public static void main(String[] args) 
	{
		//print a statement
		System.out.println("Hi");
		
		//create an integer, double, and string variable and initialize them
		int num = 2;
		double decimal = 2.0; //Declared and initialize in one line
		String word = "word";
		
		//Print the contents of the variable
		System.out.println(num + "\n");
		System.out.println(decimal);
		System.out.println(word);
		
		//Multiple int by 2 and store it in int.
		//Multiple the int by the double and store it in the double
		//Concactinate the string with "concactination
		num *= 2;
		decimal = num * decimal;
		word += " concactination";
		System.out.println("Num: " + num);
		System.out.println("Decimal: " + decimal);
		System.out.println("Word: " + word);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your favorite sport: ");
		String favSport = input.nextLine();
		System.out.println("\n\nYour favorite sport is " + favSport + " and my favorite sport is basketball.");
		
		
		
		

	}

}
