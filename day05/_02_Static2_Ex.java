package day05;

public class _02_Static2_Ex {
    //    int num = 10;
    static int num = 10; // main이 스태틱이니까 스태틱 변수를 써야 됨.

    public static void main(String[] args) {
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.
        System.out.println(num); // 출력 : 10



        System.out.println("------------");

// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.
        printValue("안녕");
        // 출력 : 안녕
    }
    public static void printValue(String str) {
        System.out.println(str); // main 이 static 이니까 연관 함수도 스태틱 함수로 설정
    }
}

