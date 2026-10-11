import java.util.Random;
import java.util.Scanner;

public class HighOrLow
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // random num generator
        Random rand = new Random();

        //nextInt(10) is 0-9 so +1 makes it 1-10
        int number = rand.nextInt(10) + 1;

        int guess = 0;          //users guess
        String trash = "";      //holds bad input
        boolean done = false;   //true once valid guess is entered

        //loops until whole num is given
        do
        {
            System.out.print("Guess a number from 1 to 10: "); //
            if (input.hasNextInt())
            {
                guess = input.nextInt();
                input.nextLine();

                //makes sure guess is within range
                if (guess >= 1 && guess <= 10)
                {
                    done = true;    //good input, stop looping
                }
                else
                {
                    System.out.println("Your guess has to be between 1 and 10.");
                }
            }
            else
            {
                trash = input.nextLine();       //reads bad input
                System.out.println("\nYou entered: " + trash);
                System.out.println("You have to enter a whole number.");
            }
        }
        while (!done);

        //shows random number
        System.out.println("The number was: " + number);

        //compares guess with random num
        if (guess > number)
        {
            System.out.println("Your guess was too high.");
        }
        else if (guess < number)
        {
            System.out.println("Your guess was too low.");
        }
        else
        {
            System.out.println("On the money!");
        }


    }
}
