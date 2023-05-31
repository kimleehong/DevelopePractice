package day04;

public class _06_Class03 {
    public static void main(String[] args) {
        Persons p1 = new Persons();
        p1.name = "홍길동";
        p1.age = 27;

        Persons p2 = new Persons();
        p2.name = "홍길순";
        p2.age = 25;

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.

        Car3 c1 = new Car3();
        c1.model = "소나타";
        c1.color = "하얀색";
        c1.speed = 100;

        // =====================================================
        // 여기에 c2 세팅
        Car3 c2 = new Car3();
        c2.model = "모닝";
        c2.color = "검정색";
        c2.speed = 70;
        // =====================================================

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.

        Cat cat1 = new Cat();
        cat1.name = "아리";
        cat1.age = 4;
        cat1.kind = "러시안블루";

        // =====================================================
        // 여기에 cat2 세팅
        Cat cat2 = new Cat();
        cat2.name = "망고";
        cat2.age = 6;
        cat2.kind = "샴";
        // =====================================================

        cat1.meow(); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow(); // 6살 샴 고양이 망고가 야옹하고 웁니다.

        Warrior w1 = new Warrior();
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        // =====================================================
        // 여기에 w2 세팅
        Warrior w2 = new Warrior();
        w2.name = "강감찬";
        w2.attack = 15;
        w2.defense = 15;
        // =====================================================

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.
    }
}

// ===========================================================
// Person, Car, Cat, Warrior 클래스 만들기

class Persons {
    String name;
    int age;

    public void introduce() {
        System.out.println("안녕하세요 " + age + "살 홍길동입니다.");
    }
}

// ===========================================================
class Car3 {
    String model;
    String color;
    int speed;

    public void drive() {// 하얀색 소나타이/가 100km로 달립니다.
        System.out.println(color + " " + model + "이/가 " + speed + "km로 달립니다.");
    }
}

// ===========================================================
class Cat {
    String name;
    int age;
    String kind;

    public void meow() { //4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        System.out.println(age + "살 " + kind + " 고양이 " + name + "가 야옹하고 웁니다.");
    }
}

// ===========================================================
class Warrior {
    String name;
    int attack;
    int defense;

    // =====================================================

    public void status() { // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        System.out.println("이름 : " + name + ", 공격력 : " + attack + ", 방어력 : " + defense);
    }

    public void attack() { // 강감찬이 15의 데미지를 입힙민다.
        System.out.println(name + "이 " + attack + "의 데미지를 입힙니다.");
    }

    public void defense() { // 이순신이 10 데미지를 방어합니다.
        System.out.println(name + "이 " + defense + "의 데미지를 방어합니다.");
    }

}