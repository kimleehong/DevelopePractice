package day06.Ex;

public class _06_Ex1 {
    public static void main(String[] args) {
        // 전사가 가지고 있는 변수 a무기가 칼과 활에 모두 호환되게 해주세요.
        전사 a전사 = new 전사(); // 전사 클래스 타입의 a전사를 만들고 그 안에는 전사설계도를 넣는다.
        // new는 새로운 주소에 만든다고 생각하고 모든 명령을 실행하면 자바가 인식할 수 있는 객체가 된다.

        a전사.나이 = 20;

        // 일단 new활이 클래스 타입이니까 클래스 타입을 담을 수 있는 그릇이 필요
        // 동일한 무기의 내용이 바뀌니까 다형성이 있다고 보면 된다. 이 경우에는 업캐스팅이다.
        // 업캐스팅 없이 다운캐스팅은 있을수도 없고 다운 캐스팅을 쓰려면 앞에 ()로 명시적으로 표시해줘야된다.
        // 칼과 활의 부모 클래스가 있으면 될 것 같다. 상위 클래스의 틀에 자기인 활과 칼의 내용을 집어 넣는다고 생각
        a전사.a무기 = new 활();
        a전사.a무기 = new 칼(); // a무기 : 전사안의 무기 타입의 a무기
        // 즉 a전사.a무기 => 무기 a무기 = new 칼(); -> 이런식으로 하면 업캐스팅
        // 무기(: 부모 클래스틀) 안에 칼(:자식 의 내용)을 담음.
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
