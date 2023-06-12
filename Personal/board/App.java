package Personal.board;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List<Article> articles = new ArrayList<>();
    int no = 1;
    Scanner sc = new Scanner(System.in);

    public void start() {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        Article[] defaultArticles = {
                new Article(no, "안녕하세요 반갑습니다. 자바 공부중이에요.", "첫번째 게시물 내용입니다."),
                new Article(no, "자바 질문좀 할게요~", "두번째 게시물 내용입니다."),
                new Article(no, "정처기 따야되나요?", "세번째 게시물 내용입니다.")
        };

        for (Article article : defaultArticles) {
            article.setRegistrationDate(today);
            articles.add(article);
            no++;
        }

        while (true) {
            System.out.print("명령어: ");
            String cmd = sc.nextLine();

            switch (cmd) {
                case "add":
                    addPost();
                    break;
                case "list":
                    listPosts();
                    break;
                case "delete":
                    deletePost();
                    break;
                case "update":
                    updatePost();
                    break;
                case "detail":
                    viewPost();
                    break;
                case "search":
                    searchPost();
                    break;
                case "exit":
                    searchPost();
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 명령어입니다. 다시 입력해주세요.");
            }
        }
    }

    private Article findArticleById(int index) {
        for (Article article : articles) {
            if (article.getNo() == index) {
                return article;
            }
        }
        return null;
    }

    private void addPost() {
        System.out.print("게시물 제목을 입력해주세요: ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요: ");
        String body = sc.nextLine();

        LocalDateTime now = LocalDateTime.now();

        Article article = new Article(no, title, body);
        article.setRegistrationDate(now);
        articles.add(article);
        no++;

        System.out.println("게시물이 등록되었습니다.");
    }

    private void listPosts() {
        if (articles.isEmpty()) {
            System.out.println("등록된 게시물이 없습니다.");
        } else {
            System.out.println("==================================");
            for (Article article : articles) {
                System.out.println("번호: " + article.getNo());
                System.out.println("제목: " + article.getTitle());
                System.out.println("==================================");
            }
        }
    }

    private void deletePost() {
        System.out.print("삭제할 게시물 번호: ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articles.remove(article);
            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }
    }

    private void updatePost() {
        System.out.print("수정할 게시물 번호: ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.print("새로운 제목: ");
            String newTitle = sc.nextLine();
            System.out.print("새로운 내용: ");
            String newBody = sc.nextLine();

            article.setTitle(newTitle);
            article.setBody(newBody);

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    private void viewPost() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요: ");
        int index = Integer.parseInt(sc.nextLine());
        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.println("==================");
            System.out.println("번호: " + article.getNo());
            System.out.println("제목: " + article.getTitle());
            System.out.println("내용: " + article.getBody());
            System.out.println("조회수: " + article.getCountOfView());
            System.out.println("등록날짜: " + article.getRegistrationDate().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
            System.out.println("==================");

            article.setCountOfView(article.getCountOfView() + 1);
        }
    }

    private void searchPost() {
        System.out.print("검색할 키워드를 입력해주세요: ");
        String keyword = sc.nextLine();

        List<Article> searchResults = new ArrayList<>();

        for (Article article : articles) {
            if (article.getTitle().contains(keyword)) {
                searchResults.add(article);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("==================");
            for (Article article : searchResults) {
                System.out.println("번호: " + article.getNo());
                System.out.println("제목: " + article.getTitle());
                System.out.println("==================");
            }
        }
    }
}
