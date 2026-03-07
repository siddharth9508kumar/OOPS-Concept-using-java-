import java.util.Scanner;
class Minconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        long min = scanner.nextLong();

        
        long minInDay = 60 * 24;
        long minInYear = minInDay * 365;

        
        long years = min / minInYear;
        long restMin = min % minInYear;
        long days = restMin / minInDay;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days.");

        scanner.close();
    }
}