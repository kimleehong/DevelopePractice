package day02;

public class _03_Format {
    public static void main(String[] args) {
        // 문자열 결합
        System.out.println("10" + "13");

        // 문자 + 숫자 -> 숫자를 문자로 바꿔서 문자열 결합
        System.out.println("10" + 20);

        // 변수 활용
        String name = "홍길동";
        int age = 21;
        System.out.println(age + "살 " + name + "입니다.");

        // 복잡할때 -> 일반적인 방법
        String message = String.format("%d살 %s입니다.", age, name);
        // 숫자 넣고 싶은 곳에 %d, 문자 넣고 싶은곳에 %s, 이후 변수를 넣고 싶으면 콤마 후에 순서대로 변수를 넣는다.
        // %d, %s, %f 같은 거를 형식지정자라고 하고 출력 메서드에서 사용되며, 출력하려는 값을 특정 형식으로 포맷팅하는 데 사용된다.
        System.out.println(message);

        // 편한 방법 -> 줄바꿈이 안된다.
        System.out.printf("%d살 %s입니다.\n", age, name); // 줄바꿈이 안되니까 이스케이프 시퀀스 \n 쓰면 된다.
    }
}
