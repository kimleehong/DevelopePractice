package personal.bardPractice3.article.controller;

import personal.bardPractice3.article.entity.Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    Scanner sc = new Scanner(System.in);
    List<Entity> entities = new ArrayList<>();
    int id = 1;

    public void initData() {
        Entity entity1 = new Entity(id, "안녕하세요 반갑습니다. 자바 공부중이에요.", "첫번째 내용");
        entity1.setRegistrationDates(formattedNow());
        entities.add(entity1);
        id++;

        Entity entity2 = new Entity(id, "자바 질문좀 할게요~", "두번째 내용");
        entity2.setRegistrationDates(formattedNow());
        entities.add(entity2);
        id++;

        Entity entity3 = new Entity(id, "정처기 따야되나요?", "세번째 내용");
        entity3.setRegistrationDates(formattedNow());
        entities.add(entity3);
        id++;
    }

    public String formattedNow() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedNow = now.format(formatter);
        return formattedNow;
    }

    public Entity findEntityById(int index) {
        for (Entity entity : entities) {
            if (entity.getIds() == index) {
                return entity;
            }
        }
        return null;
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String content = sc.nextLine();

        Entity entity = new Entity(id,title,content);
        entity.setRegistrationDates(formattedNow());
        entities.add(entity);
        id++;

        System.out.println("게시물이 등록되었습니다.");
    }

    public void list() {
        if (entities.isEmpty()) {
            System.out.println("게시물이 존재하지 않습니다.");
        } else {
            System.out.println("==================");
            for (Entity entity : entities) {
                System.out.println("번호 : " + entity.getIds());
                System.out.println("제목 : " + entity.getTitles());
                System.out.println("==================");
            }
        }
    }

    public void update() {
        System.out.println("수정할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Entity entity = findEntityById(index);

        if (entity == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.print("제목 : ");
            String newTitle = sc.nextLine();
            System.out.print("내용 : ");
            String newContent = sc.nextLine();

            entity.setTitles(newTitle);
            entity.setContents(newContent);
            entity.setRegistrationDates(formattedNow());

            System.out.println(index + "번 게시물이 수정되었습니다.");
        }
    }

    public void delete() {
        System.out.println("삭제할 게시물 번호 : ");
        int index = Integer.parseInt(sc.nextLine());

        Entity entity = findEntityById(index);

        if (entity == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            entities.remove(entity);
            System.out.println(index + "번 게시물이 삭제되었습니다.");
        }
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int index = Integer.parseInt(sc.nextLine());

        Entity entity = findEntityById(index);

        if (entity == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            System.out.println("==================");
            System.out.println("번호 : " + entity.getIds());
            System.out.println("제목 : " + entity.getTitles());
            System.out.println("내용 : " + entity.getContents());
            System.out.println("등록날짜 : " + entity.getRegistrationDates());

            entity.setViews(entity.getViews() + 1);

            System.out.println("조회수 : " + entity.getViews());
            System.out.println("==================");
        }
    }

    public void search() {
        System.out.print("검색 키워드를 입력해 주세요: ");
        String keyword = sc.nextLine();
        boolean found = false;
        System.out.println("=============");
        for (int i = 0; i < entities.size(); i++) {
            Entity a = entities.get(i);
            if (a.getTitles().contains(keyword)) {
                System.out.println("=============");
                System.out.println("번호: " + a.getIds());
                System.out.println("제목: " + a.getTitles());
                found = true;
            }
        }
        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    }
}

