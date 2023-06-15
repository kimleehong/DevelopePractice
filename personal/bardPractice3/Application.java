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
                mainController.add();
            } else if (cmd.equals("list")) {
                mainController.list();
            } else if (cmd.equals("update")) {
                mainController.update();
            } else if (cmd.equals("delete")) {
                mainController.delete();
            } else if (cmd.equals("detail")) {
                mainController.detail();
            } else if (cmd.equals("search")) {
                mainController.search();
            } else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }
    }
}
