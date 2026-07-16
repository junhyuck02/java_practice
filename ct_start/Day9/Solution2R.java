package Step1.Day9;

import java.util.HashMap;

public class Solution2R {

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

}
