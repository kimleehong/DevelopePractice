package Personal;

public class _01 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 10의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 불화살 스킬을 사용합니다. 1.5배의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 15의 데미지를 입힙니다.
        a전사.스킬사용();
        // 출력 : 연속 베기 스킬을 사용합니다. 2배의 피해를 입힙니다.

    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        a무기.사용(this.이름);
    }

    public void 스킬사용() {
        a무기.스킬();
    }
}

abstract class 무기 {
    void 사용(String 사용자명) {

    }

    public void 스킬() {

    }
}

class 칼 extends 무기 {
    int damage=15;
    void 사용(String 사용자명) {
        System.out.printf("%s가 칼로 %d의 데미지를 입힙니다.\n", 사용자명,this.damage);
    }
    public void 스킬() {
        System.out.printf("연속베기 스킬을 사용합니다. %d의 피해를 입힙니다.\n", this.damage * 2);
    }
}

class 활 extends 무기 {
    int damage=10;
    void 사용(String 사용자명) {
        System.out.printf("%s가 활로 %d의 데미지를 입힙니다.\n", 사용자명, this.damage);
    }
    public void 스킬() {
        System.out.printf("불화살 스킬을 사용합니다. %.1f의 피해를 입힙니다.\n", this.damage * 1.5);
    }
}