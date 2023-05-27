package day01;

public class _08_Practice_triangle {
    public static void main(String[] args) {
        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */
        System.out.println("-------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
        System.out.println("--------------------");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 출력
    /*

    높이 : [3]

      *
     **
    ***

    */
        System.out.println("------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */
        System.out.println("--------------");
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

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
        System.out.println("----------------");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------");
        int y = 3;
        for (int i = 0; i < y; i++) {
            // 공백 출력
            for (int j = 0; j < y - i - 1; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }
        // 출력
        /*


           *
          ***
         *****


         */

        System.out.println("----------------");
        y = 5;
        for (int i = 0; i < y; i++) {
            // 공백 출력
            for (int j = 0; j < y - i - 1; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }
        // 출력
        /*


             *
            ***
           *****
          *******
         *********


         */

        System.out.println("----------------");
        y = 7;
        for (int i = 0; i < y; i++) {
            // 공백 출력
            for (int j = 0; j < y - i - 1; j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 줄바꿈
        }
        // 출력
        /*


               *
              ***
             *****
            *******
           *********
          ***********
         *************


         */

    }
}
