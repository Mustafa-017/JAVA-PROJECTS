import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principal,rate,amount;
        int timesCompounded,years;

        System.out.print("Enter The Principal Amount :- ");
        principal = scanner.nextDouble();
        System.out.print("Enter The Interest Rate (in %) :- ");
        rate = scanner.nextDouble()/100;
        System.out.print("Enter The # of Times compounded per Year :- ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter The # of Years :- ");
        years = scanner.nextInt();

        amount = principal*Math.pow(1+(rate/timesCompounded) ,timesCompounded*years);

        System.out.println("The Amount After " + years + " is $" + amount);

        scanner.close();
    }
}
