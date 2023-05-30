package day3.function;

public class function5 {


    public static void test1(int radius) {
        System.out.println(radius * radius * 3.14 / 2);
    }

    public static double test2(int radius) {

        double result = radius * radius * 3.14;

        return result;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);


        // 원의 넓이 => 반지름 * 반지름 * 원주율
        test1(3);
        test1(5);

        System.out.println(test2(3));


        // 반지름이 3인 원의 넓이의 3배
        test1(3);
        System.out.println(test2(3) * 3);
        // 반지름이 3인 원의 넓이의 절반
        test1(3);
        System.out.println(test2(3) / 2);
        // 반지름이 3인 원의 넓이의 제곱


    }
}
