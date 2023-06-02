package day06;

public class _04_Casting1 {
    public static void main(String[] args) {

        // 다형성 -> 변수 하나로 여러가지 기능을 수행할 수 있다.
        무기 a무기 = new 칼();
        a무기.공격();
        // 출력 : 칼로 공격합니다.

        a무기 = new 활();
        a무기.공격();
        // 출력 : 활로 공격합니다.


    }
}

class 무기 {
    void 공격() {

    }
}

class 칼 extends 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 공격() {
        System.out.println("활로 공격합니다.");
    }
}