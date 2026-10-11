import java.util.Scanner;

public class FuelCosts
{
    static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);

    double gallons = 0;         //gallons of gas in tank
    double mpg = 0;             //miles per gallon
    double pricePerGallon = 0;  //price for one gallon
    String trash = "";          //holds bad input
    boolean done = false;       //becomes true once valid number entered


    //input 1: gallons in tank
    do
    {
        System.out.print("Enter the number of gallons of gas in the tank: ");
        if (input.hasNextDouble())
        {
            gallons = input.nextDouble();
            input.nextLine();   //clear leftover space
            done = true;        //good input, stop looping
        }
        else
        {
            trash = input.nextLine();
            System.out.println("\nYou entered: " + trash);
            System.out.println("You must enter a valid number.");
        }
    }
    while (!done);

    //input 2: miles per gallon
    done = false;   //reset done now next loop
    do
    {
        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if (input.hasNextDouble())
        {
            mpg = input.nextDouble();
            input.nextLine();       //clear left over
            done = true;            //good input, stop looping
        }
        else
        {
            trash = input.nextLine();       //bad input, try again
            System.out.println("\nYou entered: " + trash);
            System.out.println("You must enter a valid number.");
        }
    }
    while (!done);

    //input 3: price per gallon
    done = false;
    do
    {
        System.out.print("Enter the price of gas per gallon: ");
        if (input.hasNextDouble())
        {
            pricePerGallon = input.nextDouble();
            input.nextLine();
            done = true; //
        }
        else
        {
            trash = input.nextLine();
            System.out.println("\nYou entered: " + trash);
            System.out.println("You must enter a valid number.");
        }
    }
    while (!done);

    //cost for 100 miles
    double cost100Miles = (100 / mpg) * pricePerGallon;

    //distance on full tank
    double distance = gallons * mpg;

    System.out.printf("The cost to drive 100 miles is: $%.2f%n", cost100Miles);
    System.out.println("The distance the car can go with a full tank is " + distance + " miles");


    }
}
