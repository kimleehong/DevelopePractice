package day09._05_Exception1;

import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("숫자를 하나 입력해주세요 : ");
            int val = sc.nextInt();
            System.out.printf("당신이 입력한 값은 : %d\n", val);
        }
        // a를 입력한 경우 -> 숫자만 넣어주세요.

    }
}
