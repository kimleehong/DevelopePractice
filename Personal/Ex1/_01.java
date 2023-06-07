package Personal.Ex1;
/* 요구사항
       - D1 요구 : 오리를 생성하고 날게하시오.
       - D1 완료 : 클래스와 메서드를 만들어서 처리
       - D2 요구 : 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날게하시오.
       - D2 완료 : 클래스와 메서드를 만들어서 처리
       - D3 요구 : 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
       - D3 완료 : 상속을 사용해서 처리
       - D4 요구 : 게임의 재미를 위하여 고무오리를 추가하고 날게 하시오.
       - D4 완료 : 클래스와 메서드를 만들어서 처리
       - D5 요구 : 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔습니다. 고무오리 계열은 하늘을 날 수 없게 해주세요.
       - D5 완료 : 고무오리의 메서드를 새로 작성해서 해결
       - D6 요구 : 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날게 해주세요.
       - D6 완료 : 고무2오리 만들고 고무오리 상속으로 해결
       - D7 요구 : 모든 오리에게 헤엄치다 기능을 추가해주세요.
       - D7 완료 : 고무오리가 오리를 상속 받고 메서드 오버라이딩을 통해 해결
       - D8 요구 : 고무오리 계열이 헤엄치는 것도 말이 안된다. 고무오리는 둥둥 떠다니게 바꿔주세요.
       - D8 완료 : 고무오리의 헤엄치다 메서드를 재정의하여 해결
       - D9 요구 : 나는 건 날개로 날아가고, 헤엄은 둥둥 떠다니는 아수라오리를 만들어주세요.
       */
public class _01 {
    public static void main(String[] args) {
        System.out.println("=== 오리 ===");
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        // 출력 : 오리가 날개로 날아갑니다.
        // 출력 : 오리가 오리발로 헤엄칩니다.

        System.out.println("=== 청둥오리 ===");
        Duck mallard = new Mallard();
        mallard.fly();
        mallard.swim();
        // 출력 : 청둥오리가 날개로 날아갑니다.
        // 출력 : 청둥오리가 오리발로 헤엄칩니다.

        System.out.println("=== 흰오리 ===");
        Duck whiteDuck = new WhiteDuck();
        whiteDuck.fly();
        whiteDuck.swim();
        // 출력 : 흰오리가 날개로 날아갑니다.
        // 출력 : 흰오리가 오리발로 헤엄칩니다.

        System.out.println("=== 고무오리1 ===");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.swim();
        // 출력 : 고무오리는 날 수 없어요. ㅜㅠ
        // 출력 : 고무오리가 둥둥 떠다닙니다.

        System.out.println("=== 고무오리2 ===");
        Duck rubberDuck2 = new RubberDuck2();
        rubberDuck2.fly();
        rubberDuck2.swim();
        // 출력 : 고무오리는 날 수 없어요. ㅜㅠ
        // 출력 : 고무오리가 둥둥 떠다닙니다.

        System.out.println("=== 아수라오리 ===");
        Duck asura = new Asura();
        asura.fly();
        asura.swim();
        // 출력 : 아수라오리가 날개로 날아갑니다.
        // 출력 : 아수라오리가 둥둥 떠다닙니다.
    }
}

class Duck {
    public void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
    public void swim(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }

}

class WhiteDuck extends Duck {

}

class Mallard extends Duck {

}

class RubberDuck extends Duck {
    public void fly() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
    public void swim(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
class RubberDuck2 extends RubberDuck {
}
class Asura extends RubberDuck {
    public void fly() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}