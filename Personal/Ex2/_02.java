package Personal;

public class _02 {
    public static void main(String[] args) {
        System.out.println("=== 오리 ===");
        Duck duck = new Duck("오리");
        duck.performFly();
        duck.performSwim();

        System.out.println("=== 청둥오리 ===");
        Duck mallard = new Duck("청둥오리");
        mallard.performFly();
        mallard.performSwim();

        System.out.println("=== 흰오리 ===");
        Duck whiteDuck = new Duck("흰오리");
        whiteDuck.performFly();
        whiteDuck.performSwim();

        System.out.println("=== 고무오리1 ===");
        Duck rubberDuck = new RubberDuck("고무오리1");
        rubberDuck.performFly();
        rubberDuck.performSwim();

        System.out.println("=== 고무오리2 ===");
        Duck rubberDuck2 = new RubberDuck("고무오리2");
        rubberDuck2.performFly();
        rubberDuck2.performSwim();

        System.out.println("=== 아수라오리 ===");
        Duck asura = new AsuraDuck("아수라오리");
        asura.performFly();
        asura.performSwim();


    }
}

class Duck {
    String name;

    Duck(String name) {
        this.name = name;
    }

    void performFly() {
        System.out.println(name + "가 날개로 날아갑니다.");
    }

    void performSwim() {
        System.out.println(name + "가 오리발로 헤엄칩니다.");
    }
}

class RubberDuck extends Duck {
    RubberDuck(String name) {
        super(name);
    }

    void performFly() {
        System.out.println(name + "는 날 수 없어요. ㅜㅠ");
    }

    void performSwim() {
        System.out.println(name + "가 둥둥 떠다닙니다.");
    }
}

class AsuraDuck extends Duck {
    AsuraDuck(String name) {
        super(name);
    }

    void performSwim() {
        System.out.println(name + "가 둥둥 떠다닙니다.");
    }
}