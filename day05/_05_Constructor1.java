package day05;

public class _05_Constructor1 {
    public static void main(String[] args) {
        Persons p1 = new Persons(2,22,"라일락");
        // 객체를 만들면 반드시 초기화 해야된다.(변수에 초기값을 넣는 것)
        // 초기화를 아래처럼 쓰면 너무 귀찮고 부정확하다.
//        p1.no = 1;
//        p1.age = 20;
//        p1.name = "홍길동";

        // 생성자(메서드)를 클래스 내부에 만들면 된다. -> 리턴타입이 없고 반드시 실행된다. // 클래스명과 동일하게 지으면 된다.
        // 만들지 않으면 자동으로 구현되어있고 숨겨져 있다.
        // 클래스명(){
        // ★★ 초기화 ★★
        // }


        p1.introduce();
    }
}

class Persons {
    int age;
    String name;
    int no;

    Persons(int no, int age, String name){
        System.out.println("사람한명이 생성됨.");
        this.no = no;
        this.age = age;
        this.name = name;
        // this는 클래스 자체를 의미한다.
    }

    void introduce() {
        System.out.printf("안녕하세요 %d번 %d살 %s 입니다.", no, age, name);
    }
}