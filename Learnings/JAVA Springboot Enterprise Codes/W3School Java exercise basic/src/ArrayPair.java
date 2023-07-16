import java.util.Scanner;

class Input{
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[100];
	int num;
	int n;
	int input() {
		System.out.println("Enter the array length");
		n = sc.nextInt();
		System.out.println("Enter the input number");
		num = sc.nextInt();
		return num;
	}
	void arrrayinput() {
		int i = 0;
		while(i<n) {
			System.out.println("Enter the array number " + i);
			arr[i] = sc.nextInt();
			i++;
		}
	}
	void compare() {
		System.out.println("Got yur number they are ");

		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println( arr[i] +" "+ arr[j]+ " ");

				}
			}

		}
	}
	
}


public class ArrayPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input a = new Input();
		a.input();
		a.arrrayinput();
		a.compare();
		
	}

}
