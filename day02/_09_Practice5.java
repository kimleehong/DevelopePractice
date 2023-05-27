package day02;

public class _09_Practice5 {
    public static void main(String[] args) {
        int rst1 = plus(10, 20);
        System.out.println(rst1);  // 출력 : 30

        int rst2 = minus(10, 20);
        System.out.println(rst2); // 출력 : -10

        int rst3 = multiple(5, 4);
        System.out.println(rst3); // 출력 : 20

        int rst4 = divide(10, 3);
        System.out.println(rst4); // 출력 : 3

        int rst5 = square(5);
        System.out.println(rst5); // 출력 : 25

    }

    public static int plus(int a, int b) {
        int answer = a + b;
        return answer;
    }

    public static int minus(int a, int b) {
        int answer = a - b;
        return answer;
    }

    public static int multiple(int a, int b) {
        int answer = a * b;
        return answer;
    }

    public static int divide(int a, int b) {
        int answer = a / b;
        return answer;
    }

    public static int square(int a) {
        int answer = a * a;
        return answer;
    }
}

