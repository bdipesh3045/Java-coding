import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        // In java we cannot use directly use == operator to make a comparison directly
        // on the runtime cause this symbol checks the

        for (int num = 1; num <= 5; num += 1) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the traffic light color: ");
            String color = input.nextLine();
            System.out.println("Traffic light color initially is " + color);
            if (color.equals("Red")) {
                System.out.println("Car needs to be stopped");
            } else if (color.equals("Yellow")) {
                System.out.println("Slow down your car");
            } else if (color.equals("Green")) {
                System.out.println("Car can go");
            } else {
                System.out.println("Invalid input");
            }
        }
    }

}