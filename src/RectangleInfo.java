import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        double width = 0;       //width of rectangle
        double height = 0;      //height of rectangle
        String trash = "";      //holds bad input
        boolean done = false;   //becomes true once valid number is entered


        //input 1: width
        do
        {
            System.out.print("Enter width of the rectangle: ");
            if (input.hasNextDouble())
            {
                width = input.nextDouble();
                input.nextLine();       //clear leftover
                done = true;        //good input
            }
            else
            {
                trash = input.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        }
        while (!done);

        //input 2: height
        done = false;
        do
        {
            System.out.print("Enter height of the rectangle: ");
            if (input.hasNextDouble())
            {
                height = input.nextDouble();
                input.nextLine();
                done = true;
            }
            else
            {
                trash = input.nextLine();//reads bad input
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number.");
            }
        }
        while (!done); //

        //area = w * h
        double area = width * height;

        //perimeter = add all four sides up
        double perimeter = 2 * (width + height);

        //pythagorean theorem
        double diagonal = Math.sqrt(width * width + height * height);

        //show results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal of the rectangle is: " + diagonal);

    }
}
