package day05;

public class _06_This {
    public static void main(String[] args) {
        Sdf te = new Sdf();
        te.print();

        System.out.println("-------------");

        Sdf te2 = new Sdf();
        te2.a = 20;  // 현재 만들어진 객체는 te2 그것의 a값은 20
        te2.print(); // this는 te2를 가리킨다.te2의 a값은 20
    }
}

class Sdf {
    int a = 10;

    public void print() {
        System.out.println(this.a);
        int a = 100;
    }
}