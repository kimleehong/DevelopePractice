package day02;

public class _06_Function { // 클래스는 함수는 모아 두는 공간의 역할을 할 수 있다.
    // void -> 반환하지 않아도 되는 함수
    public static void main(String[] args) {
        ft();
        System.out.println(add(3,2));
    }

    public static void ft() {
        System.out.println("안녕");
    }
    // void 외의 형식은 값을 반환해야 되고 return 이 반드시 존재해야된다.
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

}

