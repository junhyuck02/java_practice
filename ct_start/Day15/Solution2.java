package Step1.Day15;

public class Solution2 {
    public String solution(String my_string, int num1, int num2) {
        String answer = "", temp = "";
        String[] arr = my_string.split("");
        temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        answer = String.join("", arr);
        return answer;
    }
}
