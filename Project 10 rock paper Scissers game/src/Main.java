import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","paper","scissors"};
        String player;
        String computer;
        String playAgain = "yes";

        do {

            System.out.print("Enter Your Choice(rock, paper, scissors) : ");
            player = scanner.nextLine().toLowerCase();

            if(!player.equals("rock") && !player.equals("scissors") && !player.equals("paper")){
                System.out.println("Invalid Choice.");
                continue;
            }

            computer = choices[random.nextInt(3)];
            System.out.println("Computer Choice " + computer);

            if(player.equals(computer)){
                System.out.println("It's a tie!");
            }
            else if ((player.equals("rock")&&computer.equals("scissors"))
                    ||(player.equals("paper")&&computer.equals("rock"))
                    ||(player.equals("scissors")&&computer.equals("paper"))) {
                System.out.println("You Won!");
            }
            else {
                System.out.println("You Lose!");
            }

            System.out.print("Play again (yes/no) : ");
            playAgain = scanner.nextLine().toLowerCase();

        }while (playAgain.equals("yes"));

        System.out.println("Thanks For Playing!");

        scanner.close();
    }
}
