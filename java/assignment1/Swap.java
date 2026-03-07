import java.lang.*;
class Swap{
    public static void main(String args[]){
     int a = 10;
     int b = 20;
     System.out.println("Before swapping a is " + a);
     System.out.println("Before Swapping b is " + b);
     int temp = a;
     a = b;
     b = temp;
     System.out.println("After swapping a is " + a);
     System.out.println("After swapping b is " + b);
    }
}