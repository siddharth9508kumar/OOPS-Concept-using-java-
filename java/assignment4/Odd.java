import java.lang.*;
class Odd{
	public static void main(String[] args){
		int n = 5;
		int sum = 0;
		int oddn = 1;
		System.out.print("The odd numbers are:");
		for(int i = 0; i<n; i++){
			System.out.println(oddn);
			sum = sum + oddn;
			oddn = oddn + 2;
		}
		System.out.println("Sum of first " + n + " odd natural numbers is: " + sum);
	}
}
