package day09._05_Exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("숫자 하나를 입력해주세요 : ");

            try { // 예외가 발생할 만한 코드
                int val = scan.nextInt();
                scan.nextLine();
                System.out.printf("당신이 입력한 값은 : %d\n", val);

            } catch (InputMismatchException e) { // 예외가 발생했을 때 처리
                System.out.println("숫자만 넣어주세요.");
                scan.nextLine();
            }



        }
        // a를 입력한 경우 -> 숫자만 넣어주세요.
    }
}