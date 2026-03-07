import java.lang.*;
class Logiope {
    public static void main(String args[]) {
        int a = 10;
	int b = 20;
        boolean or = (a > 0) || (b < 0);
	boolean and = (a > 0) && (b < 0);
	boolean not = !(a < 0);
	System.out.println("Logical or result:"+or);
	System.out.println("Logical and result:"+and);
	System.out.println("Logical not result:"+not);
    }
        
}



  