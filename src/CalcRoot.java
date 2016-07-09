import java.util.Scanner;


public class CalcRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to find the square and cube root: ");
		double num = sc.nextInt();
		System.out.println("Square root of "+ num + " is: " + Math.sqrt(num)); 
		System.out.println("Cube root of "+ num + " is: " + Math.cbrt(num));
	}

}
