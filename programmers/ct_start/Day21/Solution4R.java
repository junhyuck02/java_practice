package programmers.ct_start.Day21;

import java.util.Arrays;

public class Solution4R {
    public int solution(String[] spell, String[] dic) {
        // 1. spell 배열의 모든 문자열을 하나로 이어붙임
        char[] spellChars = String.join("", spell).toCharArray();
        // 2. 그 글자들을 정렬 (알파벳 순서)
        Arrays.sort(spellChars);
        // 3. 다시 문자열로 변환
        String sortedSpell = new String(spellChars);

        // 4. dic에 있는 각 단어를 하나씩 확인
        for (String word : dic) {
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars); // 이 단어도 글자 정렬
            if (sortedSpell.equals(new String(wordChars))) {
                return 1; // 정렬한 결과가 똑같다 = 애너그램이다!
            }
            // 둘다 정렬시키면 equals로 쉽게 비교할 수 있다
        }
        return 2;
    }
}
