import java.util.Scanner;

public class Evendigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a 7-digit number: ");
        int num = sc.nextInt();

        if (num < 1000000 || num > 9999999) {
            System.out.println("Please enter a valid 7-digit number.");
            return;
        }

        int sum = 0;
        int position = 7;

        System.out.println("Even position digits are: ");
        while (num > 0) {
            int digit = num % 10;
            if (position % 2 == 0) {
                System.out.print(digit + " ");
                sum += digit;
            }
            num /= 10;
            position--;
        }

        System.out.println("Sum of digits at even positions: " + sum);
        sc.close();
    }
}
