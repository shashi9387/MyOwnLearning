



public class Launch1 
{
	//static variables
	static int a, b, c;
	 
	//static block
	static 
	{
		System.out.println("Static block");
		a=10;
		b=20;
		c=30;
	}
	
	static void disp()
	{
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method");
		disp();

	}

}
