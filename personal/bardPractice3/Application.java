package personal.bardPractice3;

import personal.bardPractice3.article.controller.MainController;
import personal.bardPractice3.systemcontroller.SystemController;

import java.util.Scanner;

public class Application {
    MainController mainController = new MainController();
    SystemController systemcontroller = new SystemController();
    Scanner sc = new Scanner(System.in);

    public void run() {
        mainController.initData();
        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                systemcontroller.exit();
                return;
            } else if (cmd.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();
                System.out.print("게시물 내용을 입력해주세요 : ");
                String content = sc.nextLine();

                titles.add(title);
                contents.add(content);
                registrationDate.add(formattedNow());
                ids.add(id);
                id++;

                System.out.println("게시물이 등록되었습니다.");
            } else if (cmd.equals("list")) {
                if (titles.isEmpty()) {
                    System.out.println("게시물이 존재하지 않습니다.");
                    continue;
                } else {
                    System.out.println("==================");
                    for (int i = 0; i < titles.size(); i++) {
                        System.out.println("번호 : " + ids.get(i));
                        System.out.println("제목 : " + titles.get(i));
                        System.out.println("==================");
                    }
                }
            } else if (cmd.equals("update")) {
                System.out.println("수정할 게시물 번호 : ");
                int index = Integer.parseInt(sc.nextLine());

                int target = findTargetIndex(index);

                if (target == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                } else {
                    System.out.print("제목 : ");
                    String newTitle = sc.nextLine();
                    System.out.print("내용 : ");
                    String newContent = sc.nextLine();

                    titles.set(target, newTitle);
                    contents.set(target, newContent);

                    System.out.println(index + "번 게시물이 수정되었습니다.");
                }
            } else if (cmd.equals("delete")) {
                System.out.println("삭제할 게시물 번호 : ");
                int index = Integer.parseInt(sc.nextLine());

                int target = findTargetIndex(index);

                if (target == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                } else {
                    titles.remove(target);
                    contents.remove(target);
                    ids.remove(target);
                    registrationDate.remove(target);
                    views.remove(target);
                    System.out.println(index + "번 게시물이 삭제되었습니다.");
                }
            } else if (cmd.equals("detail")) {
                System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
                int index = Integer.parseInt(sc.nextLine());

                int target = findTargetIndex(index);

                if (target == -1) {
                    System.out.println("없는 게시물 번호입니다.");
                    continue;
                } else {
                    System.out.println("==================");
                    System.out.println("번호 : " + ids.get(target));
                    System.out.println("제목 : " + titles.get(target));
                    System.out.println("내용 : " + contents.get(target));
                    System.out.println("등록날짜 : " + registrationDate.get(target));
                    int newViews = views.get(target) + 1;
                    views.set(target, newViews);
                    System.out.println("조회수 : " + views.get(target));
                    System.out.println("==================");
                }
            } else if (cmd.equals("search")) {
                System.out.print("검색 키워드를 입력해 주세요: ");
                String keyword = sc.nextLine();
                boolean found = false;
                System.out.println("=============");
                for (int i = 0; i < ids.size(); i++) {
                    String a = titles.get(i);
                    if (a.contains(keyword)) {
                        System.out.println("=============");
                        System.out.println("번호: " + ids.get(i));
                        System.out.println("제목: " + titles.get(i));
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("검색 결과가 없습니다.");
                }
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
