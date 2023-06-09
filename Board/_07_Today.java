package Board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//# 기능7 : 날짜 데이터 등록하기
//        - 설명 : 게시물에 현재 번호, 제목, 내용만 있습니다. 게시물 등록 날짜를 추가해주세요.
//        - 현재 날짜 구하기를 검색해서 구현해주세요.
//        ```
//        명령어 : add
//        게시물 제목을 입력해주세요 : 제목1
//        게시물 내용을 입력해주세요 : 내용1
//        게시물이 등록되었습니다.
//        명령어 : add
//        게시물 제목을 입력해주세요 : 제목2
//        게시물 내용을 입력해주세요 : 내용2
//        게시물이 등록되었습니다.
//        명령어 : list
//        ==================
//        제목 : 새로운 제목1
//        ==================
//        제목 : 제목2
//        ==================
//        존재하지 않는 게시물 번호입니다.
//        명령어 : detail
//        상세보기 할 게시물 번호를 입력해주세요 : 2
//        ===================
//        번호 : 2
//        제목 : 제목2
//        내용 : 내용2
//        등록날짜 : 2023.06.09 10:10:10
//        ===================
//        ```

public class _07_Today {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        List<String> today = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();
                LocalDateTime currentDateTime = LocalDateTime.now();
                String formattedDateTime = currentDateTime.format(formatter);

                titles.add(title);
                contents.add(content);
                today.add(formattedDateTime);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물이 없습니다.");
                } else {
                    System.out.println("==================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호 : " + (i + 1));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("==================");
                    }
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index < 1 || index > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("새로운 제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용 : ");
                    String newContent = sc.nextLine();
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    String formattedDateTime = currentDateTime.format(formatter);

                    titles.set(index - 1, newTitle);
                    contents.set(index - 1, newContent);
                    today.set(index - 1, formattedDateTime);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                if (index < 1 || index > titles.size()) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    titles.remove(index - 1);
                    contents.remove(index - 1);
                    System.out.println(index + "번 게시물이 삭제되었습니다.");
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int index = sc.nextInt();
                sc.nextLine();
                if (index < 1 || index > titles.size()) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                } else {
                    System.out.println("==================");
                    System.out.println("제목 : " + titles.get(index - 1));
                    System.out.println("내용 : " + contents.get(index - 1));
                    System.out.println("등록날짜 : " + today.get(index - 1));
                    System.out.println("==================");
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