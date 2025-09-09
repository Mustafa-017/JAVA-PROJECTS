import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Today I went to a __________(adjective) zoo.");
        System.out.println("In a exhibit, I saw a __________(noun).");
        System.out.println("__________(noun) was __________(adjective) and __________(verb)!");
        System.out.println("I was __________(adjective)!\n");

        System.out.print("Enter an Adjective (description) : ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a Noun (animal/person) : ");
        noun1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description) : ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter A verb end with -ing (action) : ");
        verb1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description) : ");
        adjective3 = scanner.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");



        scanner.close();
    }
}
