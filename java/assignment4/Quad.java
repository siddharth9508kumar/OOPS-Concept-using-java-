import java.util.Scanner;
class Quad{
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);

		    System.out.print("Enter coefficient of x²: ");
        	double a = s.nextDouble();

        	System.out.print("Enter coefficient of x: ");
        	double b = s.nextDouble();

        	System.out.print("Enter the constant: ");
        	double c = s.nextDouble();

		    double d = b * b - 4 * a * c;
        	System.out.println("Discriminant (d) = " + d);
			double dr = Math.sqrt(d);

			if(d > 0){
                	double rt1 = (-b + dr) / (2 * a);
                	double rt2 = (-b - dr) / (2 * a);
                	System.out.println("Roots are real and distinct.");
                	System.out.println("Root 1 = " + rt1);
					System.out.println("Root 2 = " + rt2);
			}else if (d == 0) {
                	double rt = -b / (2 * a);
                	System.out.println("Roots are real and equal.");
                	System.out.println("Roots are = " + rt + " and " + rt);
			}else{
                	System.out.println("Roots are complex.");
			}
		s.close();
	}
}