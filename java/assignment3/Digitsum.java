import java.lang.*;
class Digitsum{

	public static void main(String[] args) {
		int num = 456;
        int sum = 0;
        if (num > 0 || num <= 0){
           sum = sum + (num % 10);
           num = num / 10;
           sum = sum + (num % 10);
           num /= 10;
           sum += num;
        }
        System.out.println("The sum of all the digits is: " + sum);
    }
}

