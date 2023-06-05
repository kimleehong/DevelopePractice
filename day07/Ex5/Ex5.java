package day07.Ex5;


public class Ex5 {
    public static void main(String[] args) {
        동물 동물1 = new 강아지("맥스");
        동물 동물2 = new 고양이("아리");
        동물 동물3 = new 거북이("도나텔로");

        동물1.이동하다();
        동물2.이동하다();
        동물3.이동하다();
    }
}

class 동물 {

    String 이름 = "무명";
    이동방식 a이동방식;

    void 이동하다() {
        a이동방식.이동(이름);
    }
}

class 고양이 extends 동물 {

    // 변수의 경우 오버라이딩이 적용되지 않는다.
    고양이(String 이름) {
        this.이름 = 이름;
        this.a이동방식 = new 고양이이동방식();
    }
}

class 강아지 extends 동물 {
    강아지(String 이름) {
        this.이름 = 이름;
        this.a이동방식 = new 강아지이동방식();
    }
}

class 거북이 extends 동물 {
    거북이(String 이름) {
        this.이름 = 이름;
        this.a이동방식 = new 거북이이동방식();
    }
}


class 이동방식 {
    void 이동(String 이름) {}
}

class 고양이이동방식 extends 이동방식 {
    void 이동(String 이름) {
        System.out.printf("%s 이/가 사뿐사뿐 이동합니다.\n", 이름);
    }
}

class 강아지이동방식 extends 이동방식 {
    void 이동(String 이름) {
        System.out.printf("%s 이/가 힘차게 이동합니다.\n", 이름);
    }
}

class 거북이이동방식 extends 이동방식 {
    void 이동(String 이름) {
        System.out.printf("%s 이/가 느릿느릿 이동합니다.\n", 이름);
    }
}