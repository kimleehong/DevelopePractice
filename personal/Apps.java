package personal;

import personal.article.articlecontroller.ArticleController;
import personal.systemcontroller.SysController;

import java.util.Scanner;

public class Apps {
    Scanner sc;
    SysController sysController;
    ArticleController articleController;

    Apps() {
        sc = new Scanner(System.in);
        sysController = new SysController();
        articleController = new ArticleController();
    }

    public void start() {
        // 테스트 데이터 추가
        articleController.addTestData();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            if (cmd.contains("exit")) {
                sysController.exit();
                return;
            } else if (cmd.contains("add")) {
                articleController.add();
            } else if (cmd.contains("list")) {
                articleController.list();
            } else if (cmd.contains("update")) {
                articleController.update();
            } else if (cmd.contains("delete")) {
                articleController.delete();
            } else if (cmd.equals("detail")) {
                articleController.detail();
            } else if (cmd.equals("search")) {
                articleController.search();
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }
}
