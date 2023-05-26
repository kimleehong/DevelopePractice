package day02;

public class _07_Practice3 {
    public static void main(String[] args) {
        // 메서드를 올바르게 호출해서 아래처럼 출력되게 해주세요.

        // 안녕하세요!!
        // 저는 차태진입니다.
        // 자바를 통해
        // 프로그램을 만들어보아요.


        hi2();
        hi1();
        hi4();
        hi3();


        System.out.println("----------------");

        hi();
        // 안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.

        bye();
        // 안녕히 가세요. 다음에 또 봐요!

        System.out.println("---------------");

        print(4); // 출력: 4
        print(10); // 출력: 10
        print(100); // 출력: 100

        System.out.println("------------");

        introduce();
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!
        // 안녕하세요. 저는 20살 홍길동입니다.!

        System.out.println("-------------");

        introduces(3);
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        System.out.println("-------------");
        introduces(5);
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        System.out.println("-------------");
        introduces(10);
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!
        // 안녕하세요. 20살 홍길동입니다.!


        System.out.println("---------");

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        System.out.println("-----------");

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

        greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
    }

    public static void greeting2(int i, int j) {
        // 1 안녕하세요, // 2 하이~, // 3 봉쥬

        if (i == 1) {
            for (int k = 0; k < j; k++) {
                System.out.println("안녕하세요.");
            }

        } else if (i == 2) {
            for (int k = 0; k < j; k++) {
                System.out.println("하이~");
            }

        } else if (i == 3) {
            for (int k = 0; k < j; k++) {
                System.out.println("봉쥬");
            }

        } else {
            System.out.println("잘못 입력했습니다.");
        }

    }

    public static void greeting1(int i) {
        // 1 안녕하세요, // 2 하이~, // 3 봉쥬

        if (i == 1) {
            System.out.println("안녕하세요.");
        } else if (i == 2) {
            System.out.println("하이~");
        } else if (i == 3) {
            System.out.println("봉쥬");
        } else {
            System.out.println("잘못 입력했습니다.");
        }

    }

    public static void introduces(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.");
        }
    }

    public static void introduce() {
        for (int i = 0; i < 10; i++) {
            System.out.println("안녕하세요. 저는 20살 홍길동입니다.");
        }
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void hi1() {
        System.out.println("저는 차태진입니다.");
    }

    public static void hi2() {
        System.out.println("안녕하세요.");
    }

    public static void hi3() {
        System.out.println("프로그램을 만들어보아요.");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }

    public static void hi() {
        System.out.println("안녕하세요. 저는 홍길동입니다. 잘부탁드립니다.");
    }

    public static void bye() {
        System.out.println("안녕히 가세요. 다음에 또 봐요!");
    }
}
