class Cal{
	public int add(int a, int b) {
		
		int c = a+b;
		return  c;
	} 
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal obj = new Cal();
		
		System.out.println(obj.add(10,24));
	}

}
