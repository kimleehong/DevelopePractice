package Board;
//# 기능2 : 게시물 추가
//        - 명령어 : add
//        - 설명 : 게시물은 제목, 내용으로 이루어져 있습니다. 제목과 내용을 입력받아 저장
//        - 입출력 예시
//        ```
//        명령어 : add
//        게시물 제목을 입력해주세요 : 제목1
//        게시물 내용을 입력해주세요 : 내용1
//        게시물이 등록되었습니다.
//        명령어 : add
//        게시물 제목을 입력해주세요 : 제목2
//        게시물 내용을 입력해주세요 : 내용2
//        게시물이 등록되었습니다.
//        ```

import java.util.Scanner;

public class _02_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("명령어 : ");
            String command = sc.nextLine();

            if (command.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String contents = sc.nextLine();
                System.out.println("게시물이 등록되었습니다.");
            } else if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
            }

        }

    }
}
