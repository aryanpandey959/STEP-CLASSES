import java.util.Scanner;

public class Level1q9 {

    public static void main(String[] args) {

        double km;
        double milesPerKm = 1.6;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        km = input.nextDouble();

        double miles = km / milesPerKm;

        System.out.println("The total miles is " + miles +
                           " mile for the given " + km + " km");

        input.close();
    }
}