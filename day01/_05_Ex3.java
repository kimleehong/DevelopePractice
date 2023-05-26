package day01;

import java.util.Random;

public class _05_Ex3 {
    public static void main(String[] args) {
        Random ran = new Random();

        // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
        // `int` => a라는 공간에는 정수만 담을 수 있다.
        // `;` => 문장이 끝남을 알린다.
        int a;
        a = ran.nextInt(100);
        int b = ran.nextInt(100);

        // `+` => 문장과 문자을 합친다.
        System.out.println("a : " + a);
        System.out.println("b : " + b);

        // 여기서 부터
        int c;
        c = a;
        a = b; // b값을 a변수에 저장한다. a와 b가 같지 않다 / 왼쪽이 무조건 변수
        b = c;

        // 여기까지 수정 가능

        System.out.println("a : " + a);
        // 출력 : a : b의 값
        System.out.println("b : " + b);
        // 출력 :  b : a의 값
    }
}
