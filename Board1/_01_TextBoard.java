package Board1;

import java.util.Scanner;

public class _01_TextBoard {
    public static void main(String[] args) {
//        1. 기능1 : 종료
//                - 명령어 : exit
//                - 설명 : 루프 종료.
//        - 입력출 예시
//  ```
//        명령어 : exit
//        프로그램을 종료합니다.
//  ```

        Scanner sc = new Scanner(System.in);

        System.out.print("명령어 : ");
        String exit = sc.nextLine();

        while (!exit.equals("exit")) {
            System.out.print("명령어 : ");
            exit = sc.next();
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
