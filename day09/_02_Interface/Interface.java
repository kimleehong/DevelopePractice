package day09._02_Interface;

public class Interface {
    public static void main(String[] args) {


        사람 a사람 = new 사람();

        요리사 a요리사 = a사람;
        a요리사.조리();

        아버지 a아버지 = a사람;
        a아버지.애들케어();


    }
}

class 사람 implements 요리사, 아버지 {
    public void 조리() {
        System.out.println("5성급 호텔 요리 실력으로 조리합니다.");
    }

    public void 애들케어() {
        System.out.println("주말마다 애들과 놀아줍니다.");
    }

}

interface 요리사 {
    void 조리();
}

interface 아버지 {
    void 애들케어();
}