package programmers.ct_start.Day17;

public class Solution4 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] check = quiz[i].split(" ");
            int num = Integer.parseInt(check[0]);
            int result = Integer.parseInt(check[4]);

            if (check[1].equals("+")) {
                num += Integer.parseInt(check[2]);
                if (result == num) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (check[1].equals("-")) {
                num -= Integer.parseInt(check[2]);
                if (result == num) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
