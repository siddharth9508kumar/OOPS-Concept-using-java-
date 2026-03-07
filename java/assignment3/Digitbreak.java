import java.lang.*;
class Digitbreak{

	public static void main(String[] args) {
		int num = 78567;
		
		int d1 = num / 10000;
        int d2 = (num / 1000) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 10) % 10;
        int d5 = num % 10;

        System.out.println("Digits are : " + d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
	}
}
