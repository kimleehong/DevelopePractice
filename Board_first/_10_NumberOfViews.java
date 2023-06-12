package Board_first;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//# 기능10 : 조회수
//        - 설명 : 특정 게시물을 상세보기 할 때마다 조회수를 1 올려주세요.
//        - 입출력 예시
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
//        명령어를 입력해주세요 : detail
//        상세보기 할 게시물 번호를 입력해주세요 : 1
//        ==================
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        내용 : 자바 너무 재밌어요!!
//        등록날짜 : 2024.06.09 11:20:23
//        조회수 : 1
//        ==================
//        명령어를 입력해주세요 : detail
//        상세보기 할 게시물 번호를 입력해주세요 : 1
//        ==================
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        내용 : 자바 너무 재밌어요!!
//        등록날짜 : 2024.06.09 11:20:23
//        조회수 : 2
//        ==================
//        명령어를 입력해주세요 : detail
//        상세보기 할 게시물 번호를 입력해주세요 : 1
//        ==================
//        번호 : 1
//        제목 : 안녕하세요 반갑습니다. 자바 공부중이에요.
//        내용 : 자바 너무 재밌어요!!
//        등록날짜 : 2024.06.09 11:20:23
//        조회수 : 3
//        ==================
//        ```

public class _10_NumberOfViews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        List<LocalDateTime> registrationDates = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        List<Integer> countOfView = new ArrayList<>();

        int id = 1;
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        titles.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        contents.add("첫번째 게시물 내용입니다.");
        registrationDates.add(today);
        ids.add(id);
        id++;
        countOfView.add(0);

        titles.add("자바 질문좀 할게요~");
        contents.add("두번째 게시물 내용입니다.");
        registrationDates.add(today);
        ids.add(id);
        id++;
        countOfView.add(0);

        titles.add("정처기 따야되나요?");
        contents.add("세번째 게시물 내용입니다.");
        registrationDates.add(today);
        ids.add(id);
        id++;
        countOfView.add(0);

        while (true) {
            System.out.print("명령어: ");
            String cmd = sc.nextLine();

            if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요: ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요: ");
                String content = sc.nextLine();

                titles.add(title);
                contents.add(content);
                registrationDates.add(LocalDateTime.now());
                ids.add(id);
                id++;
                countOfView.add(0);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("등록된 게시물이 없습니다.");
                } else {
                    System.out.println("==================================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호: " + ids.get(i));
                        System.out.println("제목: " + titles.get(i));
                        System.out.println("==================================");
                    }
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호: ");
                int index = Integer.parseInt(sc.nextLine());

                int target = -1;
                boolean found = false;

                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);
                    if (a == index) {
                        target = i;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    titles.remove(target);
                    contents.remove(target);
                    ids.remove(target);
                    registrationDates.remove(target);
                    countOfView.remove(target);
                    System.out.println(index + "번 게시물이 삭제되었습니다.");
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호: ");
                int index = Integer.parseInt(sc.nextLine());

                int target = -1;
                boolean found = false;
                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);
                    if (a == index) {
                        target = i;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("새로운 제목: ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용: ");
                    String newContent = sc.nextLine();

                    titles.set(target, newTitle);
                    contents.set(target, newContent);
                    registrationDates.set(target, today);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요: ");
                int index = Integer.parseInt(sc.nextLine());
                int target = -1;
                boolean found = false;

                for (int i = 0; i < ids.size(); i++) {
                    int a = ids.get(i);
                    if (a == index) {
                        target = i;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.println("==================");
                    System.out.println("번호: " + ids.get(target));
                    System.out.println("제목: " + titles.get(target));
                    System.out.println("내용: " + contents.get(target));
                    System.out.println("등록날짜: " + registrationDates.get(target).format(formatter));

                    int view = countOfView.get(target) + 1;
                    countOfView.set(target, view);

                    System.out.println("조회수: " + countOfView.get(target));
                    System.out.println("==================");
                }
            } else if (cmd.equals("search")) {
                System.out.print("검색할 키워드를 입력해주세요: ");
                String keyword = sc.nextLine();

                int target = -1;
                boolean found = false;

                for (int i = 0; i < titles.size(); i++) {
                    String a = titles.get(i);
                    if (a.contains(keyword)) {
                        target = i;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("검색 결과가 없습니다.");
                } else {
                    System.out.println("==================");
                    System.out.println("번호: " + ids.get(target));
                    System.out.println("제목: " + titles.get(target));
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