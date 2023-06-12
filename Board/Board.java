package Board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    private List<String> titles;
    private List<String> contents;
    private List<LocalDateTime> registrationDates;
    private List<Integer> ids;
    private List<Integer> countOfView;

    public Board() {
        titles = new ArrayList<>();
        contents = new ArrayList<>();
        registrationDates = new ArrayList<>();
        ids = new ArrayList<>();
        countOfView = new ArrayList<>();
    }

    public void addPost(String title, String content) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        titles.add(title);
        contents.add(content);
        registrationDates.add(now);
        ids.add(ids.size() + 1);
        countOfView.add(0);
    }

    public void listPosts() {
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
    }

    public void deletePost(int index) {
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
    }

    public void updatePost(int index, String newTitle, String newContent) {
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
            titles.set(target, newTitle);
            contents.set(target, newContent);
            registrationDates.set(target, LocalDateTime.now());

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void viewPost(int index) {
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
            System.out.println("조회수: " + countOfView.get(target));
            System.out.println("등록날짜: " + registrationDates.get(target).format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
            System.out.println("==================");

            countOfView.set(target, countOfView.get(target) + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();

        while (true) {
            System.out.println("게시물 관리 프로그램");
            System.out.println("1. 게시물 등록");
            System.out.println("2. 게시물 목록");
            System.out.println("3. 게시물 삭제");
            System.out.println("4. 게시물 수정");
            System.out.println("5. 게시물 조회");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = sc.nextInt();
            sc.nextLine();  // 개행 문자 제거

            switch (menu) {
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case 1:
                    System.out.print("제목을 입력하세요: ");
                    String title = sc.nextLine();
                    System.out.print("내용을 입력하세요: ");
                    String content = sc.nextLine();
                    board.addPost(title, content);
                    System.out.println("게시물이 등록되었습니다.");
                    break;
                case 2:
                    board.listPosts();
                    break;
                case 3:
                    System.out.print("삭제할 게시물 번호를 입력하세요: ");
                    int deleteIndex = sc.nextInt();
                    board.deletePost(deleteIndex);
                    break;
                case 4:
                    System.out.print("수정할 게시물 번호를 입력하세요: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();  // 개행 문자 제거
                    System.out.print("새로운 제목을 입력하세요: ");
                    String newTitle = sc.nextLine();
                    System.out.print("새로운 내용을 입력하세요: ");
                    String newContent = sc.nextLine();
                    board.updatePost(updateIndex, newTitle, newContent);
                    break;
                case 5:
                    System.out.print("조회할 게시물 번호를 입력하세요: ");
                    int viewIndex = sc.nextInt();
                    board.viewPost(viewIndex);
                    break;
                default:
                    System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}

