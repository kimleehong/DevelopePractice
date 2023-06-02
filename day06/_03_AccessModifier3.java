package day06;

// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class _03_AccessModifier3 {
    public static void main(String[] args) {
        Person1 p1 = new Person1();

        // 구현시작

        p1.idNumPrint();

        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}

class Person1 {
    private int id;

    // 힌트 : 여기에 메소드 2개 추가해야 합니다.
    int idNum(int num) {
        this.id = num;
        return num;
    }

    void idNumPrint() {
        System.out.println("제 번호는 " + idNum(20) + "입니다.");
    }

}
