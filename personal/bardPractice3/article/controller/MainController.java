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
        Entity entity1 = new Entity(id,"안녕하세요 반갑습니다. 자바 공부중이에요.","첫번째 내용");
        entity1.setRegistrationDates(formattedNow());
        entities.add(entity1);
        id++;

        Entity entity2 = new Entity(id, "자바 질문좀 할게요~", "두번째 내용");
        entity2.setRegistrationDates(formattedNow());
        entities.add(entity2);
        id++;

        Entity entity3 = new Entity(id,"정처기 따야되나요?","세번째 내용");
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
}
