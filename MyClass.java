import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        // In java we cannot use directly use == operator to make a comparison directly
        // on the runtime cause this symbol checks the


//    finding the largest number among three numbers
Scanner input = new Scanner(System.in);
System.out.println("Enter the number 1");
int var1=input.nextInt();
System.out.println("Enter the number 2");
int var2=input.nextInt();
System.out.println("Enter the number 3");
int var3=input.nextInt();
if (var1>var2 && var1>var3){
    System.out.println(var1);
}
else if(var2>var3){
     System.out.println(var2);
}
else{
     System.out.println(var3);
}
  }

    // Just to check how for loops works

    for(

    int num = 1;num<=5;num+=1)
    {
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

    // Finding lower case letter
    Scanner input = new Scanner(System.in);System.out.println("Whats your name?");
    String word = input.next();
    char letter = word.trim().charAt(0);System.out.println(letter);if(letter>='a'&&letter<='z')
    {
        System.out.println("Its a small case letter");
    }else
    {
        System.out.println("Its a Upper case letter");
    }
    // Fibonacci number
    int var1 = 0;
    int var2 = 1;System.out.println("How many fibonci number you want to keep printing?");
    int times = input.nextInt();for(
    int i = 0;i<=times;i++)
    {
        if (i == 0) {
            System.out.println(var1);
        } else if (i == 1) {
            System.out.println(var2);
        } else {
            int var3 = var2 + var1;
            System.out.println(var3);
            var1 = var2;
            var2 = var3;
        }
        // Count number

        System.out.println("Enter a number:");
        int num = input.nextInt();
        System.out.println("Enter the  number to count:");
        int presence = input.nextInt();
        int count = 0;
        while (num != 0) {
            int var1 = num % 10;
            System.out.println("Cuurent number" + var1);
            if (var1 == presence) {
                count++;
            }
            num = num / 10;
            System.out.println("Intial number converted to" + num);

        }
        System.out.println(count);

    }

}