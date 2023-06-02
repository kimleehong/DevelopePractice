package day06;

public class _05_Casting2 {
    public static void main(String[] args) {
        int a = 10; // int, short, byte, long
        double b = 10.5; // double, float

        // 변수의 타입과 변수에 저장되는 값의 타입이 일치해야함.
        // int c = 10.6;

        double d = 10; // int를 double 변수에 저장 X. int가 double로 바뀌어서 들어갔다.(형변환. 캐스팅)
        // 자동(묵시적) 형변환

        // 10이랑 10.0은 컴퓨터가 볼때 완전 다른 값.
        System.out.println(d);

        int e = (int)10.6; // double이 int 변수 저장X. double -> int 변환
        // 수동(명시적) 형변환
        System.out.println(e);

        // 전혀 관계 없는 타입은 형변환 X
        // int a = "hello"; // 안됨
    }
}
