package day06.Ex;

public class _06_Ex1 {
    public static void main(String[] args) {
        // 전사가 가지고 있는 변수 a무기가 칼과 활에 모두 호환되게 해주세요.
        전사 a전사 = new 전사();

        a전사.나이 = 20;

        a전사.a무기 = new 활();
        a전사.a무기 = new 칼(); // a무기 : 전사안의 무기 타입의 a무기
        // 즉 무기 a무기 = new 칼(); -> 이런식으로 하면 업캐스팅
        // 무기 : 부모 클래스(틀) 안에 자식(칼)의 내용을 담음.
    }
}

class 무기 {

}

class 칼 extends 무기 {

}

class 활 extends 무기 {

}

class 전사 {
    int 나이;
    무기 a무기;
}
