package day02;

public class _02_Multiplication {
    public static void main(String[] args) {
        // 2중 반복문(중첩 반복문)
        // 코드를 덩어리로 보는 능력이 중요하다.

        // 12345 를 10번 출력
        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 6; j++) {
                System.out.println(j);
            }

        }

        System.out.println("-------------");

        // 구구단
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------");
        // 구구단 2
        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d X %d = %d\n", j, i, j * i);
            }
            System.out.println("-----------");
        }

    }
}
