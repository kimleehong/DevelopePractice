package day01;
import java.util.Arrays;


public class P2 {
    public static void main(String[] args) {


    }
    class Solution {
        public String solution(String my_string, String alp) {
            char c = Character.toUpperCase(alp.charAt(0));
            if (my_string.contains(alp)){
                return my_string.replace(alp.charAt(0),c);
            } else {
                return my_string;
            }
        }
    }

}




