import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       ### Compound Interest Calculator

        Scanner scanner = new Scanner(System.in);

        double amt;
        double rate;
        int time;
        int years;
        double finalAmt;

        System.out.print("Enter the principal amount: ");
        amt=scanner.nextDouble();

        System.out.print("Enter the interest rate (in %age): ");
        rate=scanner.nextDouble()/100;

        System.out.print("Enter the time period (in years): ");
        years=scanner.nextInt();

        System.out.print("Enter the number of times compounded per year: ");
        time=scanner.nextInt();

        finalAmt=amt*Math.pow((1+rate/time),time*years);

        System.out.printf("The final amount is: %,.2f",finalAmt);


        scanner.close();
    }
}