package board2;

import board2.article.boardcontroller.BoardController2;
import board2.systemcontroller.SystemController2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App2 {
    Scanner sc;
    BoardController2 boardController2;
    SystemController2 systemController2;

    App2() {
        boardController2 = new BoardController2();
        systemController2 = new SystemController2();
        sc = new Scanner(System.in);
    }

    public void start() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        boardController2.addDefaultPosts();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "add":
                    boardController2.addPost();
                    break;
                case "list":
                    boardController2.listPost();
                    break;
                case "delete":
                    boardController2.deletePost();
                    break;
                case "update":
                    boardController2.updatePost();
                    break;
                case "detail":
                    boardController2.detailPost();
                    break;
                case "search":
                    boardController2.searchPost();
                    break;
                case "exit":
                    systemController2.exitPost();
                    return;
                default:
                    System.out.println("잘못된 명령어입니다. 다시 입력해 주세요.");
            }
        }
    }

}
