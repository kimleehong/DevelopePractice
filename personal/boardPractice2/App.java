package personal.boardPractice2;

import personal.boardPractice2.article.articlecontroller.ArticleController;
import personal.boardPractice2.systemcontroller.SystemController;

import java.util.Scanner;

public class App {
    ArticleController articleController;
    SystemController systemController;
    Scanner sc;

    App(){
        articleController = new ArticleController();
        systemController = new SystemController();
        sc = new Scanner(System.in);
        articleController.addTestData();
    }
    public void start(){

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) {
                systemController.exit();
                return;
            } else if (cmd.equals("add")) {
                articleController.add();
            } else if (cmd.equals("list")) {
                articleController.list();
            } else if (cmd.equals("update")) {
                articleController.update();
            } else if (cmd.equals("delete")) {
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
