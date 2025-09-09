import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char symbol ='$';
        double total;

        System.out.print("What Item Would You Want To Buy? : ");
        item = scanner.nextLine();

        System.out.print("What Is The Price For Each? : ");
        price = scanner.nextDouble();

        System.out.print("How Many Would You like? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou Have Brought " + quantity + " " + item +"/s");
        System.out.println("Your Total is " + symbol + total);

        scanner.close();
    }
}
