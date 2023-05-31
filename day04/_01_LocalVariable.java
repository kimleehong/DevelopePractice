package day04;

public class _01_LocalVariable {
    public static void main(String[] args) {

        int a = 10; // 지역변수 -> 자원 관리, 문제의 범위를 지역으로 국한

        System.out.println(a);
        System.out.println(test());

        // 데이터를 여러개 가지고 있으면 객체? 객체는 힙메모리에 저장!

        // primitive type - 8종은 스택에 만들어짐
        // byte, char, short, int, long, float, double, boolean
        // 이거 제외한 나머지는 객체로 보면 된다.
        // 단, 자바에서는 함수는 객체로 보지 않는다.

        // reference type
        // 그 외의 것들은 거의 힙에 만들어짐
        // 문자는 힙이 아닌 다른 저장 공간에 만들어짐.

        int[] arr = new int[5]; // -> arr은 참조변수고 배열은 객체(힙영역 안에 저장된 값)
    }

    public static int test(){
        int a = 10;
        return a++; // -> 리턴으로 함수가 끝나는 순간 함수 전체 메모리 데이터가 삭제됨.
    }


}
