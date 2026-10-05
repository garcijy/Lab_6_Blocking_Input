import java.sql.SQLOutput;
import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        double celsius = 0;     //temp user enters
        double fahrenheit = 0;  //the cnoverted temp
        String trash = "";      //holds bad inputs
        boolean done = false;   //becomes true once we get a valid number

        fahrenheit = celsius * 9.0 / 5.0 + 32;      //formula

        //keep asking until user enters valid number
        do
        {
            System.out.print("Enter a temperature in Celsius: ");
            if (input.hasNextDouble())  //input is a number so continue
            {
                celsius = input.nextDouble();
                input.nextLine();
                done = true;        // good input, stop looping
            }
            else //input not a number, need a valid number
            {
                trash = input.nextLine();
                System.out.print("\nYou entered: " + trash);
                System.out.println("\nYou have to enter a valid number.");
            }
        }
        while (!done);     //repeat while done is still false

        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

    }
}