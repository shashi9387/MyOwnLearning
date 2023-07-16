import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//		int arr[] = new int[5];
		//		System.out.print("input");
		//		arr[0]=scan.nextInt();
		//		arr[1]=scan.nextInt();
		//		arr[2]=scan.nextInt();
		//		arr[3]=scan.nextInt();
		//		arr[4]=scan.nextInt();
		//		
		//		int a = scan.nextInt();
		//		int b = scan.nextInt();
		//		int c = 0;
		//		int count = 0;
		//		for(int i = 0; i<5 ; i++) {
		//			if (arr[i]>a && arr[i]<b) {
		//				 c = c +arr[i];
		//				 count++;
		//			}
		//			
		//		}
		//		System.out.print("ANSWER " + c/count);	


		int  count =0;
		int a = scan.nextInt();
		while(a>0){
			int n = a%10;

			if (n%2==0) {
				count++;
			}
			a=a/10;


		}
	if (count > 2) {
		System.out.print("True");
	}
	else {
		System.out.print("False");
	}
}
}
