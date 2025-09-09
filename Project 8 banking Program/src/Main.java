import java.util.Scanner;
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        //variable
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning)
        {
            //menu
            System.out.println("*************");
            System.out.println("Banking Menu");
            System.out.println("*************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************");

            //choice
            System.out.print("Choose From 1-4 : ");
            choice = scanner.nextInt();
            System.out.println("*************");
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.printf("₹%.2f\n",balance);
    }
    static double deposit(){

        double amount;

        System.out.print("Enter Amount to deposit :- ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Can't be -ve");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){

        double amount ;
        System.out.print("Enter Amount to withdraw :- ");
        amount = scanner.nextDouble();

        if(amount>balance){
            System.out.println("INSUFFICENT BALANCE");
            return 0;
        }
        else if(amount<0){
            System.out.println("Amount Can't be -ve");
            return 0;
        }
        else {
            return amount;
        }
    }

}
