import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter The Temperature : ");
        temp = scanner.nextDouble();

        System.out.print("Covert To Celcius or Feranite? (C or F) : ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32 ;

        System.out.printf("%.2f°%s",newTemp,unit);

        scanner.close();
    }
}
