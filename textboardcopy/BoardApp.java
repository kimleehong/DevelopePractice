package textboardcopy;

import textboardcopy.article.boardcontroller.BoardController;
import textboardcopy.systemcontroller.SystemController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BoardApp {
    Scanner sc;
    SystemController systemController;
    BoardController boardController;
    BoardApp(){
        this.boardController = new BoardController();
        this.systemController = new SystemController();
        this.sc = new Scanner(System.in);
    }
    public void start() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        boardController.addDefaultPosts();

        while (true) {
            System.out.print("명령어: ");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "add":
                    boardController.addPost();
                    break;
                case "list":
                    boardController.listPosts();
                    break;
                case "delete":
                    boardController.deletePost();
                    break;
                case "update":
                    boardController.updatePost();
                    break;
                case "detail":
                    boardController.viewPost();
                    break;
                case "search":
                    boardController.searchPost();
                    break;
                case "exit":
                    systemController.exit();
                    return;
                default:
                    System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
            }
        }
    }

}
