package board_first;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//# 기능9 : 검색기능1, 제목으로 검색
//        - 명령어 : search
//        - 설명 : 제목으로 게시물 검색 기능 구현. 제목에 검색 키워드가 포함된 게시물 목록을 출력해주세요.
//        - 입출력 예시
//        - 힌트 : String의 contains 메서드
//
//        ```
//        명령어 : list
//        ==================
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        ==================
//        번호 : 2
//        제목 : 자바 질문좀 할게요~
//        ==================
//        번호 : 3
//        제목 : 정처기 따야되나요?
//        ==================
//        명령어를 입력해주세요 : search
//        검색 키워드를 입력해주세요 : 자바
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        =============
//        번호 : 2
//        제목 : 자바 질문좀 할게요~
//        =============
//        명령어를 입력해주세요 : search
//        검색 키워드를 입력해주세요 : 정처기
//        ==================
//        번호 : 3
//        제목 : 정처기 따야되나요?
//        ==================
//        명령어를 입력해주세요 : search
//        검색 키워드를 입력해주세요 : hihi
//        ==================
//        검색 결과가 없습니다.
//        ==================
//        ```
public class _09_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        ArrayList<Integer> ids = new ArrayList<>();
        List<String> today = new ArrayList<>();

        int id = 1;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

        // 테스트 데이터 추가
        titles.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        contents.add("첫 번째 게시물 내용입니다.");
        ids.add(id);
        id++;
        today.add(LocalDateTime.now().format(formatter));

        titles.add("자바 질문좀 할게요~");
        contents.add("두 번째 게시물 내용입니다.");
        ids.add(id);
        id++;
        today.add(LocalDateTime.now().format(formatter));

        titles.add("정처기 따야되나요?");
        contents.add("세 번째 게시물 내용입니다.");
        ids.add(id);
        id++;
        today.add(LocalDateTime.now().format(formatter));

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
                ids.add(id);
                id++;
                today.add(formattedDateTime);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물이 없습니다.");
                } else {
                    System.out.println("==================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호 : " + ids.get(i));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("==================");
                    }
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                int targetIndex = -1;

                // 전체탐색
                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);

                    if (a == index) {
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("새로운 제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용 : ");
                    String newContent = sc.nextLine();
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    String formattedDateTime = currentDateTime.format(formatter);

                    titles.set(targetIndex, newTitle);
                    contents.set(targetIndex, newContent);
                    today.set(targetIndex, formattedDateTime);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int index = sc.nextInt();
                sc.nextLine();

                int targetIndex = -1;

                // 전체탐색
                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);

                    if (a == index) {
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    titles.remove(targetIndex);
                    contents.remove(targetIndex);
                    ids.remove(targetIndex);
                    System.out.println(index + "번 게시물이 삭제되었습니다.");
                }

            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int index = sc.nextInt();
                sc.nextLine();
                int targetIndex = -1;

                // 게시물 번호에 해당하는 인덱스 찾기
                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);

                    if (a == index) {
                        targetIndex = i;
                        break;
                    }
                }

                if (targetIndex == -1) {
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                } else {
                    System.out.println("==================");
                    System.out.println("번호 : " + ids.get(targetIndex));
                    System.out.println("제목 : " + titles.get(targetIndex));
                    System.out.println("내용 : " + contents.get(targetIndex));
                    System.out.println("등록날짜 : " + today.get(targetIndex));
                    System.out.println("==================");
                }
            } else if (cmd.equals("search")) {
                System.out.print("검색 키워드를 입력해 주세요 : ");
                String keyword = sc.nextLine();

                boolean found = false;

                for (int i = 0; i < titles.size(); i++) {
                    String a = titles.get(i);
                    if (a.contains(keyword)) {
                        System.out.println("==================");
                        System.out.println("번호 : " + ids.get(i));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("==================");
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("검색 결과가 없습니다.");
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