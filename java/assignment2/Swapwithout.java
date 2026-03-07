import java.lang.*;
class Swapwithout
{
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		System.out.println("Before swapping the value of a is"+a);
		System.out.println("Before swapping the value of b is"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Now the value of a is"+a);
		System.out.println("Now the value of b is"+b);
	}
}