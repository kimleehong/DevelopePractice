package Personal;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String convertedStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLowerCase(c)){
                convertedStr += Character.toUpperCase(c);
            } else if(Character.isUpperCase(c)){
                convertedStr += Character.toLowerCase(c);
            }
        }
        System.out.println(convertedStr);
















    }
}
