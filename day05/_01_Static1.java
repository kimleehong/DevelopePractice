package day05;

public class _01_Static1 {
    public static void main(String[] args) {
        // static은 자원의 공유를 위해 사용. 모든 객체가 하나의 자원을 공유.
        // static은 객체지향을 위반한다.(캡슐화 위반)


        Person.introduce(); // static 메서드는 객체화 하지 않고 클래스에서 바로 기능 사용 가능.

        // static은 static 자원만 사용 가능하다. ☆★☆★☆★☆★☆★☆★☆★☆★
        // non-static은 static 사용 가능. ☆★☆★☆★☆★☆★☆★☆★☆★


        // 변수든 메서드든 굳이 static을 붙여서 사용하지 않아도 거의 모든 작업이 가능
        // 유틸 클래스같은 경우는 static을 붙여서 사용하면 편하긴 하다.
    }
}
class Person {
    static int no; // 번호
    int age; // 나이
    static String name; // 이름

    public static void introduce() {
        System.out.printf("%d번 %s입니다!!\n", no, name);

        //System.out.println("안녕하세요");
    }
}