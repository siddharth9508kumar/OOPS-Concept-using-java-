import java.util.Scanner;
class Bmical{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your weight in kg: ");
        double wt = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double ht = scanner.nextDouble();
        
        double bmi = wt / (ht * ht);
        
        System.out.println("Your BMI is :" + bmi + "kg per meter square.");
	}
}
