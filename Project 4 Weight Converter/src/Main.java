import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double wKgs;
        double wLbs;
        int input;

        System.out.println("***** Weight Convertor *****");
        System.out.println("For Kgs To Lbs Press 1.");
        System.out.println("For Lbs To Kgs Press 2.");

        System.out.print("Enter Your Choise :- ");
        input = scanner.nextInt();

        if (input == 1){
            System.out.print("Enter Weight In Kgs :- ");
            wKgs = scanner.nextDouble();
            wLbs = wKgs * 2.20462;
            System.out.println("Wight In Lbs is " + wLbs);
        }
        else if (input == 2) {
            System.out.print("Enter Weight In Lbs :- ");
            wLbs = scanner.nextDouble();
            wKgs = wLbs * 0.453592;
            System.out.println("Wight In Kgs is " + wKgs);
        }
        else {
            System.out.println("Incorrect Input.");
        }

        scanner.close();
    }
}
