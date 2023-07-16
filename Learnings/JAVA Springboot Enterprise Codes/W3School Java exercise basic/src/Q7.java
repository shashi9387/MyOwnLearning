import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java method to count all vowels in a string. Go to the editor
		// Test Data:
		// Input the string: w3resource
		// Expected Output:
		// Number of  Vowels in the string: 4
		
		
//			Q7_1 a = new Q7_1();
//			a.method();
		
		    Scanner scanner =new Scanner(System.in);
		    String string =scanner.nextLine();
		    int c = 0 ;
		    for(int i=0;i<string.length();i++){
		      if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u'){
		        c++;
		            
		      
		    
		    
		  }
		}
		    System.out.print(c);
	}
}

//class Q7_1{
//	void method(){
//		
//		Scanner sc = new Scanner(System.in);
//		char[] charArray = {'a','e','i','o','u'};
//		String str = sc.nextLine();
//		int count = 0;
//		str.indexOf('a');
//		for(int i = 0; i <= str.length(); i++) {
//			if(charArray.contains(str.charAt(i)) {
//				count++;
//			}
//		}
//		System.out.println(count);
//	}
//}