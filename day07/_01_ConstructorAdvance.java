package day07;

import java.util.Scanner;

public class _01_ConstructorAdvance {
    public static void main(String[] args) {
        // 사람 만들기 버전1
        사람 a사람 = new 사람(1, 29, "홍길동");
        a사람.자기소개();

        System.out.println("----------------");

        // 사람 만들기 버전2 -> 나이와 이름을 아직 모르는 경우
        Scanner sc = new Scanner(System.in);
        사람 b사람 = new 사람(2);

    }
}

class 사람 {
    int 번호;
    int 나이;
    String 이름;

    public 사람(int 번호, int 나이, String 이름) { // Alt + insert -> constructor -> 자동 생성
        this.번호 = 번호;
        this.나이 = 나이;
        this.이름 = 이름;
    }

    // 같은 이름으로 메서드나 생성자를 여러개 만드는 것 -> 오버로딩
    public 사람(int 번호){
        this.번호 = 번호;
    }

    void 자기소개() {
        System.out.printf("%d살 %s입니다.",나이, 이름);
    }
    void 자기소개(int a) {
        System.out.printf("안녕?\n",나이, 이름);
    }
}
