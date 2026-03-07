import java.util.Scanner;
class Cube {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = s.nextInt();
		
		
		for (int i = 1; i <= num; i++){
		    System.out.println("The cube of " + i + " is: " + (i*i*i));
		}
		s.close();
	}
}