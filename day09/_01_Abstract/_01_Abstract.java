package day09._01_Abstract;

public class _01_Abstract {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
    }
}
class 전사 {
    무기 a무기 = new 칼();
    void 공격() {
        a무기.사용();
    }
}

// 추상클래스 -> 추상메서드가 있는 클래스
abstract class 무기 {
    // 추상메서드 -> 내용 없는 메서드(반드시 오버라이딩 해야됨)
    abstract void 사용();

    void info() {
        System.out.println("무기입니다.");
    }
}

class 칼 extends 무기 {
    void 사용() {
        System.out.println("칼로 공격");
    }

    void info() {
        System.out.println("칼입니다.");
    }
}

class 활 extends 무기 {
    void 사용() {
        System.out.println("활로 공격");
    }
}