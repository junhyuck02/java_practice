package Step1.Day9;

import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {

    HashMap<String, String> getMorse() {
        HashMap<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        return morse;
    }

    public String solution(String letter) {
        String answer = "";
        HashMap<String, String> morse = getMorse();
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String s : arr) {
            sb.append(morse.get(s));
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution2 sol = new Solution2();

        String letter = "";
        while (true) {
            System.out.print("모스부호 입력: ");
            letter = scanner.nextLine();

            if (letter.length() < 1 || letter.length() > 1000) {
                System.out.println("다시 입력하세요");
                continue;
            }

            if (letter.startsWith(" ") || letter.endsWith(" ")) {
                System.out.println("시작과 끝에 공백이 없어야 합니다");
                continue;
            }

            if (letter.contains("  ")) {
                System.out.println("공백은 연속으로 두 개 이상 존재하면 안됩니다");
                continue;
            }

            // . 과 - 와 공백으로만 이루어져 있는지 체크
            boolean isValid = true;
            for (char c : letter.toCharArray()) {
                if (c != '.' && c != '-' && c != ' ') {
                    isValid = false;
                    break;
                }
            }

            if (!isValid) {
                System.out.println(".과 -와 공백으로만 이루어져야 해요!");
                continue;
            }

            break;
        }

        System.out.println("결과: " + sol.solution(letter));
        scanner.close();
    }

}
