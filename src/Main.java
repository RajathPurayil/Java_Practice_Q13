import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
*/

        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompting user to  enter the two points

        System.out.println("Enter the x1 and  y1 :");

        double x1 = input.nextDouble();
        double y1= input.nextDouble();

        //Prompting user to enter the two points


        System.out.println("Enter x2 and y2 :");
        double x2= input.nextDouble();
        double y2= input.nextDouble();
        // Calculate distance between the two points

        double Distance = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);

        // Display result
        System.out.println("The distance between the two points is " + Distance);






    }
}