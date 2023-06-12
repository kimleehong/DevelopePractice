package Board1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board1 {
    private List<Article> articles;
    private int id;

    public Board1() {
        articles = new ArrayList<>();
        id = 1;

        // 초기 게시물 추가
        addPost("안녕하세요 반갑습니다. 자바 공부중이에요.", "첫번째 게시물 내용입니다.");
        addPost("자바 질문좀 할게요~", "두번째 게시물 내용입니다.");
        addPost("정처기 따야되나요?", "세번째 게시물 내용입니다.");
    }

    public void addPost(String title, String body) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        Article article = new Article(id, title, body);
        article.setRegistrationDate(now);
        articles.add(article);
        id++;

        System.out.println("게시물이 등록되었습니다.");
    }

    public void listPosts() {
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

    public void deletePost(int index) {
        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articles.remove(article);

            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }
    }

    public void updatePost(int index, String newTitle, String newBody) {
        Article article = findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            article.setTitle(newTitle);
            article.setBody(newBody);

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void viewPost(int index) {
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

    private Article findArticleById(int id) {
        for (Article article : articles) {
            if (article.getNo() == id) {
                return article;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board1 board = new Board1();

        while (true) {
            System.out.println("게시물 관리 프로그램");
            System.out.println("1. 게시물 등록");
            System.out.println("2. 게시물 목록");
            System.out.println("3. 게시물 삭제");
            System.out.println("4. 게시물 수정");
            System.out.println("5. 게시물 조회");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (menu == 1) {
                System.out.print("제목을 입력하세요: ");
                String title = sc.nextLine();
                System.out.print("내용을 입력하세요: ");
                String body = sc.nextLine();
                board.addPost(title, body);
            } else if (menu == 2) {
                board.listPosts();
            } else if (menu == 3) {
                System.out.print("삭제할 게시물 번호를 입력하세요: ");
                int deleteIndex = sc.nextInt();
                board.deletePost(deleteIndex);
            } else if (menu == 4) {
                System.out.print("수정할 게시물 번호를 입력하세요: ");
                int updateIndex = sc.nextInt();
                sc.nextLine();  // 개행 문자 제거
                System.out.print("새로운 제목을 입력하세요: ");
                String newTitle = sc.nextLine();
                System.out.print("새로운 내용을 입력하세요: ");
                String newBody = sc.nextLine();
                board.updatePost(updateIndex, newTitle, newBody);
            } else if (menu == 5) {
                System.out.print("조회할 게시물 번호를 입력하세요: ");
                int viewIndex = sc.nextInt();
                sc.nextLine();  // 개행 문자 제거
                board.viewPost(viewIndex);
            } else {
                System.out.println("잘못된 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }

    private class Article {
        private int no;
        private String title;
        private String body;
        private LocalDateTime registrationDate;
        private int countOfView;

        public Article(int no, String title, String body) {
            this.no = no;
            this.title = title;
            this.body = body;
            this.registrationDate = null;
            this.countOfView = 0;
        }

        public int getNo() {
            return no;
        }

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        public LocalDateTime getRegistrationDate() {
            return registrationDate;
        }

        public int getCountOfView() {
            return countOfView;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public void setRegistrationDate(LocalDateTime registrationDate) {
            this.registrationDate = registrationDate;
        }

        public void setCountOfView(int countOfView) {
            this.countOfView = countOfView;
        }
    }
}
