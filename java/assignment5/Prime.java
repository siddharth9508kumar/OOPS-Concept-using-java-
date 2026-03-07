import java.util.Scanner;
class Prime{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = s.nextInt();
		
		if(num <= 1){
			System.out.println("Not a prime number.");
		}else{
			boolean isPrime = true;
			
			for(int i = 2; i <= Math.sqrt(num); i++){
				if (num % i == 0){
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
                		System.out.println("Prime number.");
            		} else {
                		System.out.println("Not a prime number.");
            		}
		}
		s.close();
	}
}


