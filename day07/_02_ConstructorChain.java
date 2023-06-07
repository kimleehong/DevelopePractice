package day07;

public class _02_ConstructorChain {
    public static void main(String[] args) {
        // 모든 객체는 생성자를 호출해서 만든다.
//        new Animal(); // Animal생성자 호출
        new Dog(20); // Dog생성자 호출 ->  Dog 생성자를 호출 하려면 Animal 생성자를 호출한 뒤에야 할 수 있다.
        // -> 자바에서는 하위 개념의 생성자를 호출했을 때 상위 개념의 생성자가 연쇄적으로 호출된다 -> ConstructorChain : 생성자 연쇄 호출
    }
}

class Animal {
    Animal() {
        System.out.println("Animal 생성자 호출");
    }

    Animal(int age) { // 생성자 오버로딩을 하면 생성자가 두개가 생김 그럴때는 시스템에서 암묵적으로 만들어준 기본 생성자는 지워짐.(사용자가 만든건 안지워짐)
        // 따라서 하위 super 에서 어떤 걸 호출 할 지 정확히 써줘야됨.
        System.out.printf("%d살 Animal 생성자 호출\n", age);
    }
}

class Dog extends Animal {
    Dog(int age) {
//        Animal(); 부모를 언급할 때는 클래스 이름으로 언급x ->  생성자가 아니라 함수를 호출하려고 한다.
        super(age); //-> 부모의 오버로딩 된 생성자를 호출 -> 부모에 관련 생성자가 반드시 있어야 한다
//        super(); // -> 부모의 기본 생성자 호출
        System.out.println("Dog 생성자 호출");
    }
}