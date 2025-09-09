import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String filePath = "src\\game.txt";
        String word = word(filePath);
//        System.out.println(word);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0 ; i < word.length() ; i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to java Hangman!");
        System.out.println("************************");

        while (wrongGuesses < 6){

            System.out.print(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0){
                System.out.println("Correct Guess!");
                for (int i = 0 ; i< word.length() ; i++){
                    if (word.charAt(i) == guess){
                        wordState.set(i ,guess);
                    }
                }

                if (!wordState.contains('_')){
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("You won!");
                    System.out.println("The Word Was : "+word);
                    break;
                }
            }
            else {
                wrongGuesses++;
                System.out.println("Wrong Guess!");
            }

        }
        if (wrongGuesses == 6){
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The Word Was : "+word);
        }

        scanner.close();

    }
    static String getHangmanArt(int wrongGuesses){

        return switch (wrongGuesses){
            case 0 -> """
                      
                      
                      
                      """;
            case 1 -> """
                       o
                      
                      
                      """;
            case 2 -> """
                       o
                       |
                      
                      """;
            case 3 -> """
                       o
                      /|
                      
                      """;
            case 4 -> """
                       o
                      /|\\
                      
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };

    }
    static String word(String filePath){

        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Something Went Wrong!");
        }

        Random random  =new Random();

        return words.get(random.nextInt(words.size()));
    }
}
