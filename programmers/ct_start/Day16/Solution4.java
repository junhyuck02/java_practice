package programmers.ct_start.Day16;

public class Solution4 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        String c = "";
        for (int i = 0; i < s1.length; i++) {
            c = s1[i];
            for (int j = 0; j < s2.length; j++) {
                if (c.equals(s2[j]))
                    answer++;
            }
        }
        return answer;
    }
}
