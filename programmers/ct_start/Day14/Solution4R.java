package programmers.ct_start.Day14;

public class Solution4R {
    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) { // isUpperCase !! 확인하는 부분
                chars[i] = Character.toLowerCase(c); // 대문자면 소문자로
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c); // 소문자면 대문자로
            }
        }
        return new String(chars); // char배열을 다시 문자열 객체로 변환해서 반환

    }
}
