package Personal;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {

//      arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i] * 10);
        }
        System.out.println("------------------");

//      배열을 두번 출력
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("첫 번째 출력:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n두 번째 출력:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("------------------");

//      배열을 이용해 5개의 숫자를 입력받고 출력해주세요.
        int[] arr3 = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("배열에 들어갈 숫자를 입력해 주세요");

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }

        System.out.println("입력된 숫자를 출력합니다:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        System.out.println("------------------");

//      배열을 이용해 5개의 문장을 입력받고 출력해주세요.
        String[] arr4 = new String[5];
        System.out.println("배열에 들어갈 문장를 입력해 주세요");
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = sc.next();
        }

        System.out.println("입력된 숫자를 출력합니다:");
        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }
        System.out.println("------------------");

//      배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        int[] arr5 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i + 1;
        }
        for (int i = 4; i >= 0; i--) {
        System.out.print(arr[i] + " ");
        }

    }

}
