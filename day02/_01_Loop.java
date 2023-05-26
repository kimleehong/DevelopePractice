package day02;

public class _01_Loop {
    public static void main(String[] args) {
        // 반복문
        // while, for 가 가장 많이 쓰임

        // while : if 문과 작동 원리는 거의 같다. 다른 점이 있다면 조건이 참일 동안 계속 반복한다는 점이다.
        int i = 1; // 조건 변수 초기화
        while (i <= 5) { // 조건식
            System.out.println(i);
            i++; // i = i + 1; // 조건 변수 제어
        }

        System.out.println("----------");

        // for
//        for (조건 변수 초기화; 조건식; 조건 변수 제어) {
//            // 반복해서 실행될 코드
//        }

        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

        System.out.println("----------");

        // 1부터 100까지 출력해주세요.
        for (int k = 1; k <= 100; k++) {
            System.out.println(k);
        }

        System.out.println("----------");

        // 1 ~ 100까지 수중 짝수만 출력
        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }

        System.out.println("----------");
        // 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        System.out.println("----------");
        /*
축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,

현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.

손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

(90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)

현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
*/
        int time = 74;
        int score = 0;
//      시간이 5 의 배수가 될때 마다 스코어가 1 점씩 오르고 시간은 90 보다 작거나 같다.
        for (int j = 74; j <= 90; j++) {
            if (j % 5 == 0) {
                score++;
            }
        }
        System.out.println(score);


        System.out.println("-------------");

        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        // ex )
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1

        int a = 12;
        int b = 5;

        if (a < b) {
            for (int j = a; j <= b; j++) {
                System.out.println(j);
            }
        } else if (a > b) {
            for (int j = b; j <= a; j++) {
                System.out.println(j);
            }
        } else {
            System.out.println("a와 b는 같은 값입니다.");
        }

    }
}
