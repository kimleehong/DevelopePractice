package day04;

public class _04_Class01 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car car1 = new Car();
        car1.num = 3;
        car1.run();
        System.out.println("--------------");


        //v2. 3개의 자동차가 2번씩 달리게 해주세요.
        car1.run();
        Car car2 = new Car();
        car2.num = 2;
        car2.run();
        Car car3 = new Car();
        car3.num = 2;
        car3.run();
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.

    }
}

class Car {
    int num;

    public void run() {
        for (int i = 0; i < num; i++) {
            System.out.println("자동차가 달립니다");
        }
    }

}
