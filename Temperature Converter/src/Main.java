import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp=scanner.nextDouble();
        System.out.print("Enter C for celcius and F for fahrenhite: ");
        unit=scanner.next();

        newTemp = unit.equals("c") ? (temp * 9 / 5) + 32 : (temp - 32) * 5 / 9;

        if(unit.toLowerCase()=="c"){
        System.out.printf("Temperature in fahrehnite is: %.2f",newTemp);
        } else{
            System.out.printf("Temperature is celcius is: %.2f",newTemp);
        }

        scanner.close();
    }
}