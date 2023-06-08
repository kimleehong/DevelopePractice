package day09._04_ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        사람 사람1 = new 사람(24, "홍길동");
        사람 사람2 = new 사람(30, "이순신");
        사람 사람3 = new 사람(41, "을지문덕");
        사람 사람4 = new 사람(32, "황진이");

        // 1. 네 사람을 Arraylist 에 저장
        // 2. 네 사람에게 자기소개 시키기
        // 3. 30대인 사람에게만 자기소개 시키기


        // 1번 해결
        ArrayList<사람> person = new ArrayList<>();
        person.add(사람1);
        person.add(사람2);
        person.add(사람3);
        person.add(사람4);

        System.out.println("-------------");

        // 2번 해결
//        for (int i = 0; i < 4; i++) {
//            person.get(i).introduce();
//        }

        for (사람 소개 : person) {
            소개.introduce();
        }

        System.out.println("-------------");

        // 3번 해결
//        for (int i = 0; i < 4; i++) {
//            if ( 30 <= person.get(i).getAge() && person.get(i).getAge() < 40 ){
//                person.get(i).introduce();
//            }
//        }

        for (사람 소개 : person) {
            if (30 <= 소개.getAge() && 소개.getAge() < 40) {
                소개.introduce();
            }
        }


    }
}

class 사람 {
    private int age;
    private String name;

    사람(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void introduce() {
        System.out.printf("%d살 %s입니다.\n", age, name);
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.name;
    }
}
