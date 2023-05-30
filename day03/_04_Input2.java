package day03;

import java.util.Scanner;

public class _04_Input2 {
    public static void main(String[] args) {
        //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
        //입출력 예시
        //첫번째 숫자를 입력해주세요: 12
        //두번째 숫자를 입력해주세요: 33
        //12 + 33 = 45

        Scanner sc = new Scanner(System.in);
//        int i;
//        int j;
//
//        System.out.print("첫 번째 숫자를 입력해주세요 : ");
//        i = sc.nextInt();
//
//        System.out.print("두 번째 숫자를 입력해주세요 : ");
//        j = sc.nextInt();
//
//        System.out.println(i + " + " + j + " = " + (i + j));
//

        System.out.println("-------------");

        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.


//        System.out.print("원하는 단을 입력해주세요 : ");
//        int dan = sc.nextInt();
//
//        System.out.printf("%d단 출력.\n", dan);
//        for (int i = 0; i < 10; i++) {
//            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//        }

        System.out.println("-------------------");
        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.
//        System.out.print("이름을 입력해주세요 : ");
//        String name = sc.next();
//        System.out.print("나이를 입력해주세요 : ");
//        int age = sc.nextInt();
//        System.out.println("출력 : 안녕하세요 " + age + "세 " + name + "입니다.");


        System.out.print("나이를 입력해주세요 : ");
        int age = sc.nextInt();

        sc.nextLine(); // next계열을 쓰면 \n 전에 있는 자료를 가져간다. nextLine은 \n까지 가져간다.
        // next 계열 후에 nextline 을 쓰면 nextline이 빈 \n을 추출한다.
        // 따라서 두개를 저런 순서로 쓴다면 실제 출력될 nextline 앞에 한번 더 써서 \n을 빼줘야 된다.

        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();

        System.out.printf("안녕하세요. %d세 %s입니다.", age, name);
    }
}
