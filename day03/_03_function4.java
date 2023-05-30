package day3.function;

public class function4 {

    public static void greeting1(int language) {
        if(language == 1) {
            System.out.println("안녕~");
        } else if(language == 2) {
            System.out.println("하이~");
        } else if(language == 3) {
            System.out.println("봉쥬~");
        } else if(language == 4) {
            System.out.println("싸와디캅");
        }

    }

    public static void greeting2(int language, int cnt) {

        for(int i = 0; i < cnt; i++) {
            greeting1(language);
        }

    }
    public static void main(String[] args) {

        // 나 프로그래밍 잘하고 싶다 -> 중복을 없앤다.

        // 매개변수는 인사말 언어를 의미
        // 1은 한국어, 2는 영어, 3은 프랑스어

        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

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
}
