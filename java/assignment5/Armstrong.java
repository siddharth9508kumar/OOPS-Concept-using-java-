import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Armstrong{
    public static void main(String[] args) throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        String st = b.readLine();
        
        int num = Integer.parseInt(st);
        int ori = num;
        int sum = 0;
        int pow = st.length();
        
        while(num > 0){
            int n = num % 10;
            sum += Math.pow(n,pow);
            num /= 10;
        }
        
        if (ori == sum){
            System.out.println(ori + " is a armstrong number.");
        }else{
            System.out.println(ori + " is a not armstrong number.");
        }
    }
}