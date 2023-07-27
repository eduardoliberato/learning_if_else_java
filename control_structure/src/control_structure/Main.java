package control_structure;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y, z;

		System.out.println("Enter the value of the first number: \n");
		x = sc.nextInt();
		System.out.println("Enter the value of the second number: \n");
		y = sc.nextInt();
		System.out.println("Enter the value of the third number: \n");
		z = sc.nextInt();

		if (x > y && x > z) {
			System.out.printf("The number %d is the largest number", x);
		}
		else if (y > z) {
			System.out.printf("The number %d is the largest number", y);
		} else {
			System.out.printf("The number %d is the largest number", z);
		}

	}

}
