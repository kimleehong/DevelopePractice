package day02;

public class _04_Practice1 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                if (i % 2 == 0){
                    System.out.printf("%d X %d = %d\n", j, i, j * i);
                }
            }
            System.out.println("-----------");
        }

    }
}
