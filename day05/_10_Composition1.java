package day05;

public class _10_Composition1 {
    public static void main(String[] args) {
        // 상속만을 이용해서 중복을 제거하는 것은 한계가 있다.
        // 컴포지션(구성) -> 고드의 중복은 구성으로 해결 가능하다.
        // 컴포지션은 소유의 개념이다.

        Hong1 hong1 = new Hong1();
        hong1.java();
        hong1.cl();

        hong1.pi();

        System.out.println("-------------");

        Hong2 hong2 = new Hong2();
        hong2.java();
        hong2.pi();
    }
}

class Hongs {
    Hong1 hong1 = new Hong1();
    Hong2 hong2 = new Hong2();
}

class Hong1 {

    //  Hong2에 연락할 수단 생성 // -> Hong1은 Hong2에 의존성이 있다.
    Hong2 hong2 = new Hong2();

    public void java() {
        System.out.println("자바20 프로그래밍");
    }

    public void cl() {
        System.out.println("C언어");
    }

    public void pi() {

    }

}

class Hong2 {
    public void java() {
        System.out.println("자바17 프로그래밍");
    }

    public void pi() {
        System.out.println("파이썬");
    }
}
