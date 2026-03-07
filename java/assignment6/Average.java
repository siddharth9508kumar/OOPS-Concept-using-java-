import java.util.Scanner;
class Average{
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter total number of elemets in the array: ");
	    int n = sc.nextInt();
	    if (n <= 0){
	        System.out.println("Enter a valid length.");
	        return;
	    }
	    
	    int sum = 0;
	    int arr[] = new int[n];
	    System.out.println("Enter the elements: ");
	    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        double avg = (double) sum / n;
        System.out.println("The average of elements inside the array is: " + avg);
        
        sc.close();
        }
}