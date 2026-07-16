package Step1.Day8;

public class Solution2R {
    public String solution(int age) {
        String result = "";
        for (char check : String.valueOf(age).toCharArray()) {
            result += (char) ('a' + (check - '0'));
        }
        return result;
    }
}