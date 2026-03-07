import java.util.Scanner;
class Minmax{
    	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter total number of elements in the array: ");
	    int n = sc.nextInt();
	    if (n <= 0){
	        System.out.println("Enter a valid length.");
	        return;
	    }
	    
	    int arr[] = new int[n];
	    System.out.println("Enter the elements: ");
	    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++){
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The max value of the array is: " + max);
        System.out.println("The min value of the array is: "+ min);
        
        sc.close();
        }
}


// Enter total number of elements in the array: 6
// Enter the elements: 
// 12
// 45
// 7
// 89
// 23
// 5
// The max value of the array is: 89
// The min value of the array is: 5