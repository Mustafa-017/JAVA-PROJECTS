import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,101);

        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Guess The Number Between 1 To 100 ");

        do {
            System.out.print("Guess the Number : ");
            guess = scanner.nextInt();
            attempts++;
            if (guess > randomNumber){
                System.out.println("Guess Lower Number");
            }
            else if(guess < randomNumber ){
                System.out.println("Guess Higher Number");
            }
            else {
                System.out.println("CORRECT!");
            }
        }while (guess != randomNumber);

        System.out.println("You Have WON");
        System.out.println("You have Crack in " + attempts + " Attempts.");

        scanner.close();
    }
}
