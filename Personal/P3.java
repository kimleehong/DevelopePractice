package Personal;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 4; i >= 0; i--) {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
