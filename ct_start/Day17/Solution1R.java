package Step1.Day17;

public class Solution1R {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        String s2 = String.valueOf(k);
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s2)) {
                return i + 1;
            }
        }
        return -1;
        // return ("인덱스" + num).indexOf(String.valueOf(k));
    }
}
