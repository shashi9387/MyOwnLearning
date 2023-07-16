import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("Shashi Kumar");
		
//		We can also write it as
		
		System.out.println("Hello\nShashi Kumar");
		
		
		String first;
		String last;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello");
		System.out.print("User first name ::");
		first=sc.next();
		System.out.print("User last name ::");
		last = sc.next();
		System.out.print("User full name is " + first + " " + last );
		
		
	}

}
