package day06;

import day06.test.Test;

public class _01_AccessModifier1 {
    public static void main(String[] args) {
        // 객체 지향 3요소 - 캡슐화(객체로 만들기), 상속, 다형성
        Test t1 = new Test();
        Test2 t2 = new Test2();

        System.out.println(t1.a);
//        System.out.println(t2.a); // private라서 외부에서 사용 불가
        t2.printNum(); // -> 캡슐화
    }
}
class Test2{
    private int a = 10; // private : 해당 클래스 내부에서만 접근 가능
    // -> default 접근제어자 : 동인한 파일 내에서 얼마든지 접근 가능

    public void printNum() {
        System.out.println(a);
    }
}
