package day01;

public class _06_Operator {
    public static void main(String[] args) {
        // 산술연산 -> +, -, /, *, %
        System.out.println(10 / 3); // 정수와 정수는 정수로 표시
        System.out.println(10 / 3.0); // 실수 하나만 있으면 실수로 표시
        System.out.println(10 % 3.0); // 실수 하나만 있으면 실수로 표시

        // 비교연산 : >(=), <(=), ==, !=
        // boolean(논리값) : 참, 거짓
        System.out.println(10 >= 5);
        System.out.println(10 != 6);
        System.out.println(false);
        System.out.println(true);

        System.out.println("-----------");
        // 논리 연산!
        // 'and'는 다 참일때만 참, 나머지는 거짓(모두 참이어야 참) -> 기호 : &&
        // 'or'는 다 거짓일 때만 거짓, 나머지는 참(하나만 참이면 참) -> 기호 : ||
        System.out.println(true && false); // and
        System.out.println(true && true); // and
        System.out.println(true || false); // or
        System.out.println(false || false); // or

        System.out.println("---------------");

        // 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.
        if ( true ) {
            System.out.println("참");
        }

        if ( false ) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("거짓");
        }

        if ( a > 10 ) {
            System.out.println("거짓");
        }

        if ( a >= 10 ) {
            System.out.println("참");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("참");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b; // -> c = false

        if ( c ) {
            System.out.println("거짓");
        }

        if ( c == false ) {
            System.out.println("참");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("참");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("거짓");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("참");
        }
        
    }
}
