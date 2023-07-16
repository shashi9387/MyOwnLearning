import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		
		int sub;
		sub = 74 - 36;
		System.out.println(sub);
		
		
//		This can also be solved by giving input
		Scanner sc = new Scanner(System.in);
		int firstnumber;
		int secondnumber;
		
		System.out.print("Please enter first number ::");
		firstnumber = sc.nextInt();
		System.out.print("Please enter second number ::");
		secondnumber = sc.nextInt();
		sub = firstnumber - secondnumber;
		System.out.print("Substraction is ::" + sub );
		
		
	}
}
