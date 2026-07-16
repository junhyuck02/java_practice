package Step1.Day9;

public class Solution3 {
    public String solution(String rsp) {
        String[] arr = rsp.split("");
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("2")) {
                arr[i] = "0";
            } else if (arr[i].equals("0")) {
                arr[i] = "5";
            } else if (arr[i].equals("5")) {
                arr[i] = "2";
            }
        }
        answer = String.join("", arr);
        return answer;
    }
}
