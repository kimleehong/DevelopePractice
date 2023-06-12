package Board_first;
//# 기능3 : 게시물 조회
//        - 명령어 : list
//        - 설명 : add로 저장된 게시물의 목록이 나온다.
//        - 입출력 예시
//        ```
//        명령어 : list
//        ==================
//        제목 : 제목1
//        내용 : 내용1
//        ==================
//        제목 : 제목2
//        내용 : 내용2
//        ==================
//        ```

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_Inquiry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();

                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();

                titles.add(title);
                contents.add(content);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물이 없습니다.");
                } else {
                    System.out.println("==================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("내용 : " + contents.get(i));
                        System.out.println("==================");
                    }
                }
            } else if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
            }
        }
    }
}
