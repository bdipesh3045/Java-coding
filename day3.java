import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
        int sum = sum();
        System.out.println("Sum of two numbers is " + sum);
    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println("Enter a number");
        int b = input.nextInt();
        return (a + b);
    }
}
