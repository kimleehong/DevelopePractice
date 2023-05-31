package day04;

public class _03_Class {
    public static void main(String[] args) {
        // 정보 3개 -> 나이, 키, 몸무게

        // 1
        System.out.println(20);
        System.out.println(170);
        System.out.println(60);
        System.out.println("------------");

        // 2
        int age = 20;
        int height = 170;
        int weight = 60;
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println("------------");

        // 3 -> 메서드 사용
        PrintPersonalInfo(20, 170, 60);

        // 4 -> 배열 사용해서 여러자료 관리 -> 단점은 배열은 여러가지 자료형을 담을 수 없다.
        int[] person1 = {20, 170, 60};
        int[] person2 = {30, 180, 68};
        PrintPersonalInfo2(person1);
        PrintPersonalInfo2(person2);

        // 5 -> 클래스를 사용하여 여러가지 자료를 관리할 수 있다. -> 내가 표현하고자 하는 대상을 정의해서 자바한테 알려줘야 된다.
        // 클래스란 여러 유형의 데이터와 그 데이터를 사용하는 메서드의 집합
        Person person = new Person(); // 객체 생성 -> 클래스(설계도)를 실체하는 인스턴스(객체)로 만드는 선언 : 배열과 비슷하다.
        // int[] person = new int[5]; -> int[]자리만 클래스로 바뀜.
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.age);
        System.out.println(person.height);

        System.out.println("------------");

        // person의 값 재정의
        person.name = "김태양";
        person.address = "대전시";
        person.age = 20;
        person.height = 180.5;

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.age);
        System.out.println(person.height);

        System.out.println("------------");

        // 사람 2
        Person2 persons2 = new Person2();
        System.out.println(persons2.name);
        System.out.println(persons2.favorite);
        System.out.println(persons2.height);
        System.out.println(persons2.weight);

        System.out.println("------------");
    }

    // 함수
    public static void PrintPersonalInfo(int age, int height, int weight) {
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println("------------");
    }

    public static void PrintPersonalInfo2(int[] person1) {
        System.out.println(person1[0]);
        System.out.println(person1[1]);
        System.out.println(person1[2]);
        System.out.println("------------");
    }

}

// 클래스 정의
class Person { // class -> 사용자 정의 배열 만들기
    String name = "홍길동"; // 사람 이름
    String address = "서울시"; // 사람 주소
    int age = 30; // 사람 나이
    double height = 179.5; // 사람 키
}

class Person2 {
    String name = "놀부"; // 사람 이름
    String favorite = "군것질"; // 사람 좋아하는 것
    double height = 179.5; // 사람 키
    int weight = 68; // 사람 몸무게
}
