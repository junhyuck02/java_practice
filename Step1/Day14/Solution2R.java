package Step1.Day14;

public class Solution2R {
    public int solution(int order) {
        String num = String.valueOf(order);
        // String str = order+""; 이렇게 해서도 바꿀수 있음
        int count = 0;
        String[] arr = num.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("3") || arr[i].equals("6") || arr[i].equals("9")) {
                count++;
            }
        }
        return count;
    }
}
