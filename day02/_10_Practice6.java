package day02;

public class _10_Practice6 {
    public static void main(String[] args) {
        // 0은 양수로 보겠습니다.
        int no = -1;

        if (isNegative(no)) {

            System.out.println("음수입니다.");

        } else {

            System.out.println("양수입니다.");

        }
        // no 값을 바꿔가면서 테스트해보세요.

        System.out.println("-------------");

        // 변수 의 값까지 짝수만 출력

        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4
    }

    // 쉬운 버전


    public static boolean isNegative(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEven(int num) {
        // 참이나 거짓을 뽑는 리턴값이 필요하다
        return num % 2 == 0;
    }

    public static void printEven(int n) {
        // isEven 메서드를 이용.
        for (int i = 2; i <= n; i++) { // 0은 어떤 수로 나눠도 0이다. 따라서 2부터 시작
            if (isEven(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
