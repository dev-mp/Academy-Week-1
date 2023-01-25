package introtojava;
import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	/* initialize our 2 initial variables
     initialize the 3rd variable which is the sum of the first 2 variables */
	int num1 = 0, num2 = 1, num3 = num1 + num2;
	// 
    System.out.print("Enter a number: ");
    int userNum  = scanner.nextInt();
    // loop with counter starting at 2 (because we already included 0 and 1) and it loops for 7 times so that we can get the first 10 results
    // 
	for(int i = 2; i < userNum; i++) {
        /*Once loop runs once, the value for num3 changes as num1 and num2 values get reassigned at the end 
        which in turn pass their values on each time an iteration is complete
        */
		num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		System.out.println(num3);
	}
	
}
		
}