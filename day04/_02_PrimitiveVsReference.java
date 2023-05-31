package day04;

public class _02_PrimitiveVsReference {
    public static void main(String[] args) {
        String str1 = new String("Hello world!!");
        String str2 = new String("Hello world!!");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1 == str2);

        // str1, str2는 참조값(주소값)
        // heap 안에 만들어진 애들은 인스턴스나 객체라고 부른다.

        // 주소를 비교 -> 만약에 두 변수가 동일한 주소를 가지고 있다면 같다고 나옴.
        System.out.println("------------");
        if( str1 == str2 ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }

        // 두 참조 변수가 가리키는 객체의 내용을 비교
        System.out.println("------------");
        if( str1.equals(str2) ){
            System.out.println("str1과 str2는 같은 값을 가지고 있습니다.");
        }
        else{
            System.out.println("str1과 str2는 다른 값을 가지고 있습니다.");
        }


    }
}
