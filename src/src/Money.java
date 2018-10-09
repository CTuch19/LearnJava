import java.util.Scanner;

public class Money {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money do you have in dollars? \n$");
        double dollars = sc.nextDouble();

        int cents = (int)((dollars+.01) * 100);

        System.out.println("You have " + cents/25 + " quarters");
        cents = cents % 25;

        System.out.println("You have " + cents/10 + " dimes");
        cents = cents % 10;

        System.out.println("You have " + cents/5 + " nickels");
        cents = cents % 5;

        System.out.println("You have " + cents + " pennies");
    }
}

