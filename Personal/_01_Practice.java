package Personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> titles = new ArrayList<>();
        List<String> contents = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();

        int id = 1;

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.contains("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (cmd.contains("add")) {
                System.out.print("게시물 제목을 입력해 주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해 주세요 : ");
                String content = sc.nextLine();

                titles.add(title);
                contents.add(content);
                ids.add(id);
                id++;

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.contains("list")) {
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
            } else if (cmd.contains("update")) {
                System.out.print("수정할 게시물 번호 : ");
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
                    System.out.print("제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String newContent = sc.nextLine();

                    titles.set(target, newTitle);
                    contents.set(target, newContent);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.contains("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
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

                    System.out.println(index + "번 게시물이 삭제되었습니다.");
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
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
                    System.out.println("존재하지 않는 게시물 번호입니다.");
                } else {
                        System.out.println("==================");
                        System.out.println("번호 : " + ids.get(target));
                        System.out.println("제목 : " + titles.get(target));
                        System.out.println("내용 : " + contents.get(target));
                        System.out.println("==================");
                }
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }

    }

}
