package Personal;

public class _01 {
    public static void main(String[] args) {
        /*  직각삼각형 유형1
         *
         **
         ***
         ****
         *****
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 직각삼각형 유형2
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 직각삼각형 유형3(1의 역)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 직각삼각형 유형4(2의 역)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 직각삼각형 유형5(정삼각형)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        // 역직각삼각형 유형6(5의 역)
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
