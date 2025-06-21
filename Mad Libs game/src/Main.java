import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

//        Mad libs game

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1= scanner.nextLine();
        System.out.print("Enter an noun (animal or object): ");
        noun1= scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2= scanner.nextLine();
        System.out.print("Enter an verb (action): ");
        verb1= scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3= scanner.nextLine();

        System.out.println("\nToday I went to a "+ adjective1+" zoo.");
        System.out.println("In an exhibit, I saw a "+ noun1+".");
        System.out.println(noun1 +" was "+ adjective2 +" and " + verb1 +"!" );
        System.out.println("It was "+ adjective3 +"!");


        scanner.close();
    }
}