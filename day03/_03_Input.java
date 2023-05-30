package day03;


import java.util.Scanner;

public class _03_Input {
    public static void main(String[] args) {

        // -> Scanner 메서드를 이용
        Scanner sc = new Scanner(System.in);

        // 숫자 입력
        int num = sc.nextInt();
        System.out.println("출력 : " + num);

        // 문자 한 줄 입력
        String str = sc.nextLine();
        System.out.println("출력 : " + str);

        // 단어 한개
        String str2 = sc.next();
        System.out.println("출력 : " + str2);



    }
}
