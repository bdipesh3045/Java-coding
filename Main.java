import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        // Linear search
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        int i = linearsearch(arr, target);
        System.out.println(i + 1);

    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }

}