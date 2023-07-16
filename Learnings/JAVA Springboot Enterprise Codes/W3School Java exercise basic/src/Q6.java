import  java.util.Scanner;
public class Q6 {
	
//	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		
		System.out.print("Input first number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input second number: ");
		  int num2 = in.nextInt();
		int sum = num1 + num2;
		int mul = num1 * num2;
		int sub = num1 - num2;
		float div = num1 / num2;
		int rem = num1 % num2;
		
		System.out.println( sum+ " " + sub+ " " + mul+ " " + div+ " " + rem);
	 
	}
		
}
