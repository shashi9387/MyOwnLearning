import java.util.Scanner;
public class Q2 {
	
//	Write a program to print the sum of two numbers  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		sum = 74 + 36;
		System.out.println(sum);
		
		
//		This can also be solved by giving input
		Scanner sc = new Scanner(System.in);
		int firstnumber;
		int secondnumber;
		
		System.out.print("Please enter first number ::");
		firstnumber = sc.nextInt();
		System.out.print("Please enter second number ::");
		secondnumber = sc.nextInt();
		sum = firstnumber + secondnumber;
		System.out.print("Sum is ::" + sum );
		
		
	}

}
