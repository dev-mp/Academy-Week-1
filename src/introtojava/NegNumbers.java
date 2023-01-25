package introtojava;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int userInput = scanner.nextInt();
	        if(userInput >= 0){
	            System.out.println("You have entered a positive number!");
	        }else if(userInput < 0){
	            System.out.println("You have entered a negative number!");
	        } 


	}

}
