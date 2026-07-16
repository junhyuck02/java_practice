package programmers.ct_start.Day12;

import java.util.Scanner;

public class Solution1R {
    public String solution(String my_string) {
        String answer = "";
        if (my_string.contains("a"))
            my_string = my_string.replace("a", "");
        if (my_string.contains("e"))
            my_string = my_string.replace("e", "");
        if (my_string.contains("i"))
            my_string = my_string.replace("i", "");
        if (my_string.contains("o"))
            my_string = my_string.replace("o", "");
        if (my_string.contains("u"))
            my_string = my_string.replace("u", "");
        answer = my_string;
        // answer = my_string.replaceAll("[aeiou]", "");
        /*
         * String[] vowels = new String[]{"a", "e", "i", "o", "u"};
         * for(String vowel : vowels){
         * if(my_string.contains(vowel)){
         * my_string = my_string.replace(vowel, "");
         * }
         * }
         */
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1R sol = new Solution1R();
        String my_string = "";

        while (true) {
            System.out.print("문자열을 입력하세요 (길이 1~1,000, 소문자와 공백만 가능):");
            my_string = scanner.nextLine();
            int len = my_string.length();

            if (len >= 1 && len <= 1000 && my_string.matches("^[a-z ]*$")) {
                break;
            } else {
                System.out.print("입력 형식이 잘못되었습니다. 다시 입력해주세요");
                if (len < 1 || len > 1000) {
                    System.out.println("(사유: 길이 미달 또는 초과)");
                } else {
                    System.out.println("(사유: 소문자와 공백 외 문자 포함)");
                }
            }
        }

        String result = sol.solution(my_string);
        System.out.println("✨ 모음이 제거된 결과: \"" + result + "\"");

        scanner.close();
    }

}
