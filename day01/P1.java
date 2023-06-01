package day01;

public class P1 {
    public static void main(String[] args) {
            /*
    높이 : [3]

    *
    **
    ***


    */

   /*

    높이 : [3]


    ss*
    s**
    ***

    */
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

/*

    ss*
    s***
    *****

    */

        // 정삼각형
        System.out.println("----------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 직각삼각형 반대로
        System.out.println("----------------");

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 역삼각형
        System.out.println("----------------");

        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
