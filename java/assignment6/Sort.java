import java.util.Scanner;
class Sort{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter total number element want ot insert: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements into array:");
       for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}

// Enter total number element want ot insert: 5
// Enter elements into array:
// 12
// 56
// 45
// 0
// 23
// Sorted array is: 
// 0 12 23 45 56 