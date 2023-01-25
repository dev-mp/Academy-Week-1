package introtojava;

import java.util.Scanner;


public class ModulosCalc {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int a,b;
	
	System.out.print("Enter the first number: ");
	a = scanner.nextInt();
	
	if(a % 2 == 0) {
		System.out.print("Number is even");
	} else {
		System.out.print("Number is odd");
	}

	}

}
