package Step1.Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution2 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution2 sol = new Solution2();

        List<String> inputList = new ArrayList<>();

        System.out.println("단어들을 하나씩 입력하세요.");
        System.out.println("(입력을 마치려면 'exit'를 입력하세요)");

        while (true) {
            System.out.print("단어 입력: ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("exit")) {
                if (inputList.isEmpty()) {
                    System.out.println("최소 하나의 단어는 입력해야 합니다");
                    continue;
                }
                break;
            }

            int len = word.length();
            if (len >= 1 && len <= 100) {
                inputList.add(word);
            } else {
                System.out.println("단어의 길이는 1에서 100 사이여야 합니다.");
            }
        }

        String[] arr = inputList.toArray(new String[0]);

        int[] answer = sol.solution(arr);
        System.out.println("입력한 배열: " + Arrays.toString(arr));
        System.out.println("각 단어의 길이: " + Arrays.toString(answer));

        scanner.close();
    }
}