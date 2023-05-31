package day04;

import java.util.Random;

public class _05_Class02 {
    public static void main(String[] args) {
        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.
        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.


//        Car2 velocity = new Car2();
//        velocity.car = "자동차1";  // 자동차1 객체를 할당
//        velocity.setSpeed();  // 최고속력 출력
//
//        velocity.car = "자동차2";  // 자동차2 객체를 할당
//        velocity.setSpeed();  // 최고속력 출력

        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
        Car2 c3 = new Car2();

        c1.run();
        c2.run();
        c3.run();

    }
}

//class Car2 {
//    String car;
//    int v;
//
//    public void setSpeed() {
//        switch (car) {
//            case "자동차1":
//                v = 220;
//                break;
//            case "자동차2":
//                v = 250;
//                break;
//            default:
//                v = 0;
//                break;
//        }
//        System.out.println("자동차가 최대속력 " + v + "km로 달립니다.");
//    }
//}

class Car2 {
    public void run(){
        int min = 200;
        int max = 280;
        int range = max - min + 1;

        Random random = new Random();
        int maxVelocity = random.nextInt(range) + min;

        System.out.println("자동차가 최대속력 " + maxVelocity + "km로 달립니다.");

    }
}
