
import java.util.Scanner;
import java.util.Arrays;

public class day4 {
    public static void main(String[] args) {
        System.out.println("Hello sir");
        int[] arr1 = new int[5];
        int count = 2;
        // System.out.println(arr1.length);
        // for (int i=0; i<5; i++){
        // arr1[i]=count;
        // count+=2;
        // }
        //
        // for (int i=0; i<5; i++){
        // System.out.println(arr1[i]);
        // // Trying out another form of loop
        //
        // }
        // for (int num: arr1){
        // System.out.println("New loop "+num);
        // }
        Scanner input = new Scanner(System.in);
        // String[] name = new String[5];
        // for (int i=0;i<5;i++){
        // System.out.println("Enter your name:");
        // name[i]=input.nextLine();
        // }
        // for (String nam : name){
        // System.out.println(nam);
        //
        //
        // }
        // System.out.println(Arrays.toString(name));
        String[] subject = new String[5];
        int[][] marks = new int[2][5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the subject: ");
            subject[i] = input.nextLine();
            System.out.println("Enter your marks in " + subject[i] + " For term in 2023");

            marks[0][i] = input.nextInt();

            System.out.println("Enter your marks in " + subject[i] + " For term in 2024");

            marks[1][i] = input.nextInt();
            input.nextLine();

        }

        // For return

        for (int i = 0; i < 5; i++) {

            System.out.println("Marks in " + subject[i] + "=" + marks[0][i]);
            System.out.println("Marks in " + subject[i] + "=" + marks[1][i]);

            // arks[0][i]=input.nextInt();
            //
            // System.out.println("Enter your marks in "+subject[i]+" For term in 2024");
            //
            // marks[1][i]=input.nextInt();

        }

    }
}
