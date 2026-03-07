import java.util.Scanner;
class Speedcal{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the distance in kilometers: ");
        double dis = scanner.nextDouble();

        System.out.print("Enter time taken in hours: ");
        double time = scanner.nextDouble();
        
        double dism = dis * 1000;
        double times = time * 3600;
        
        
        double speed = dism / times;
        
        System.out.println("Your speed is: " +(dis / time) + " kilometers per hour");
        System.out.println("Your speed is: " + speed + " meter per second");
	}
}
