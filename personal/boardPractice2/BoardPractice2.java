package personal.boardPractice2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardPractice2 {
    static List<String> titles = new ArrayList<>();
    static List<String> contents = new ArrayList<>();
    static List<Integer> ids = new ArrayList<>();
    static List<String> registrationDate = new ArrayList<>();
    static List<Integer> countOfView = new ArrayList<>();
    static int id = 1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        addTestData();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해 주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해 주세요 : ");
                String content = sc.nextLine();

                titles.add(title);
                contents.add(content);
                ids.add(id);
                id++;
                registrationDate.add(formattedDate());
                countOfView.add(0);

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                System.out.println("==================");
                for (int i = 0; i < titles.size(); i++) {
                    System.out.println("번호 : " + ids.get(i));
                    System.out.println("제목 : " + titles.get(i));
                    System.out.println("==================");
                }
            } else if (cmd.equals("update")) {
                System.out.print("수정할 게시물 번호 : ");
                int index = Integer.parseInt(sc.nextLine());

                int target = findTargetIndex(index);

                if (index == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.print("제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String newContent = sc.nextLine();

                    titles.set(target, newTitle);
                    contents.set(target, newContent);
                    registrationDate.set(target, formattedDate());

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int index = Integer.parseInt(sc.nextLine());

                int target = findTargetIndex(index);

                if (index == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    titles.remove(target);
                    contents.remove(target);
                    ids.remove(target);
                    registrationDate.remove(target);
                    countOfView.remove(target);
                    System.out.println(index + "번 게시물이 삭제되었습니다.");
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기할 게시물 번호 : ");
                int index = Integer.parseInt(sc.nextLine());

                int target = findTargetIndex(index);

                if (index == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                } else {
                    System.out.println("==================");
                    System.out.println("번호 : " + ids.get(target));
                    System.out.println("제목 : " + titles.get(target));
                    System.out.println("내용 : " + contents.get(target));
                    System.out.println("등록날짜 : " + registrationDate.get(target));

                    int view = countOfView.get(target) + 1;
                    countOfView.set(target, view);
                    System.out.println("조회수 : " + countOfView.get(target));
                    System.out.println("==================");
                }
            } else if (cmd.equals("search")) {
                System.out.print("검색 키워드를 입력해주세요 : ");
                String keyword = sc.nextLine();
                boolean found = false;

                for (int i = 0; i < titles.size(); i++) {
                    String a = titles.get(i);
                    if (a.contains(keyword)) {
                        System.out.println("=============");
                        System.out.println("번호 : " + ids.get(i));
                        System.out.println("번호 : " + titles.get(i));
                        System.out.println("=============");
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("검색 결과가 없습니다.");
                }
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }

    public static String formattedDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        return formattedDate;
    }

    public static void addTestData() {
        ids.add(id);
        id++;
        titles.add("안녕하세요 반갑습니다. 자바 공부중이에요.");
        contents.add("첫번째 내용입니다.");
        registrationDate.add(formattedDate());
        countOfView.add(0);

        ids.add(id);
        id++;
        titles.add("자바 질문좀 할게요~");
        contents.add("두번째 내용입니다.");
        registrationDate.add(formattedDate());
        countOfView.add(0);

        ids.add(id);
        id++;
        titles.add("정처기 따야되나요?");
        contents.add("세번째 내용입니다.");
        registrationDate.add(formattedDate());
        countOfView.add(0);
    }

    public static int findTargetIndex(int index) {
        for (int i = 0; i < ids.size(); i++) {
            if (ids.get(i) == index) {
                return i;
            }
        }
        return -1;
    }
}
