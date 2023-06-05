package day07.Ex6;

// 중복되는것을 최대한 줄여보시오.
public class Ex6 {
    public static void main(String[] args) {
        전사 a광전사 = new 광전사(); // -> 광전사 객체는 전사 클래스 타입의 변수 a광전사에 할당됩니다. 부모 클래스 타입의 변수에 자식 클래스의 객체를 할당
        a광전사.공격(); // 칼로 공격

        성전사 a성전사 = new 성전사();
        a성전사.공격(); // 칼로 공격

        요정전사 a요정전사 = new 요정전사();
        a요정전사.공격(); // 활로 공격

        난쟁이전사 a난쟁이전사 = new 난쟁이전사();
        a난쟁이전사.공격(); // 활로 공격
    }
}

class 전사 {
    무기 a무기;

    전사(무기 무기) {
        a무기 = 무기;
    }

    void 공격() {
        a무기.작동();
    }
}

class 광전사 extends 전사 {
    광전사() {
        super(new 칼());
    }
}

class 성전사 extends 전사 {
    성전사() {
        super(new 칼());
    }
}

class 요정전사 extends 전사 {
    요정전사() {
        super(new 활());
    }
}

class 난쟁이전사 extends 전사 {
    난쟁이전사() {
        super(new 활());
    }
}

class 무기 {
    void 작동() {
    }
}

class 칼 extends 무기 {
    void 작동() {
        System.out.println("칼로 공격");
    }
}

class 활 extends 무기 {
    void 작동() {
        System.out.println("활로 공격");
    }
}