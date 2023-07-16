class Telesko{
	int i;
	Telesko(){
		System.out.println("Parent class");
		i = 20;
		System.out.println(i);
		this.meth();
	}
	
	void meth() {
		System.out.println("method inside parent"); 
	 }
}
class A extends Telesko{
	int j;
	A(){
		System.out.println("child class");
		j = 20;
		System.out.println(j);
	}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		

	}

}
