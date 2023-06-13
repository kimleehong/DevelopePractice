package Personal.board.article.boardcontroller;

import Personal.board.article.entity.Article;
import Personal.board.article.entity.ArticleRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardController {
    Scanner sc = new Scanner(System.in);
    ArticleRepository articleRepository;

    public BoardController() {
        articleRepository = new ArticleRepository();

    }

    public void addPost() {
        System.out.print("게시물 제목을 입력해주세요: ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요: ");
        String body = sc.nextLine();

        articleRepository.insert(title, body);

        System.out.println("게시물이 등록되었습니다.");
    }

    public void listPosts() {

        List<Article> articles = articleRepository.getArticleList();

        if (articles.isEmpty()) {
            System.out.println("등록된 게시물이 없습니다.");
            return;
        } else {
            articleRepository.printArticles(articles);
        }
    }

    public void deletePost() {
        System.out.print("삭제할 게시물 번호: ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = articleRepository.findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        } else {
            articleRepository.delete(article);
            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }
    }

    public void updatePost() {
        System.out.print("수정할 게시물 번호: ");
        int index = Integer.parseInt(sc.nextLine());

        Article article = articleRepository.findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
            return;
        } else {
            System.out.print("새로운 제목: ");
            String newTitle = sc.nextLine();
            System.out.print("새로운 내용: ");
            String newBody = sc.nextLine();

            articleRepository.update(article, newTitle, newBody);

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void viewPost() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요: ");
        int index = Integer.parseInt(sc.nextLine());
        Article article = articleRepository.findArticleById(index);

        if (article == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articleRepository.viewer(article);
        }
    }

    public void searchPost() {
        System.out.print("검색할 키워드를 입력해주세요: ");
        String keyword = sc.nextLine();

        List<Article> searchResults = new ArrayList<>();
        List<Article> articles = articleRepository.getArticleList();

        for (Article article : articles) {
            if (article.getTitle().contains(keyword)) {
                searchResults.add(article);
            }
        }

        if (searchResults.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            articleRepository.printArticles(searchResults);
        }
    }
}
