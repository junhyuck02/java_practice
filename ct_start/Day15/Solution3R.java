package Step1.Day15;

// import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
import java.util.stream.Collectors;

public class Solution3R {
    // 방법 1
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .filter(c -> s.chars()
                        .filter(ch -> ch == c.charAt(0))
                        .count() == 1)
                // filter는 (조건)이 true면 통과, false는 제거, 얘가 stream을 순회해줌
                // 문자열 s를 chars로 int stream(아스키값)으로 변환
                // stream에서 조건에 맞는 것만 남기고 센 숫자가 2이상이면 제거
                .sorted()
                .collect(Collectors.joining());
        // collect로 값으로 모아서 반환
    }

    // 방법 2
    // public String solution(String s) {
    // Map<Character, Integer> map = new HashMap<>();
    // // 각 문자의 등장 횟수를 세는 map
    // for (char c : s.toCharArray()) {
    // // 문자열을 char 배열로 변환
    // map.put(c, map.getOrDefault(c, 0) + 1);
    // // getOrDefault(키,기본값): 키에 해당하는 값을 꺼내는데 키가 없으면 기본값을 반환
    // // c의 현재 값을 꺼내고 (없으면 0), 거기에 +1 해서 다시 저장해라
    // }
    // List<Character> list = new ArrayList<>();
    // // 딱 한번만 나온 문자만 list에 추가
    // for (char c : map.keySet()) {
    // // map의 키들만 꺼내서
    // if (map.get(c) == 1)
    // // 등장횟수가 1인 것만 통과
    // list.add(c);
    // }
    // Collections.sort(list);
    // StringBuilder sb = new StringBuilder();
    // for (char c : list)
    // sb.append(c);
    // // 문자를 하나씩 이어붙임
    // return sb.toString();
    // }

    // 방법 3
    // public String solution(String s) {
    // int[] count = new int[26];
    // // 등장횟수 저장할 배열
    // for (char ch : s.toCharArray()) {
    // count[ch - 'a']++; // 알파벳을 배열 인덱스로 변환해서 해당 인덱스++
    // // 'a' - 'a' = 0 -> a는 index 0
    // // 'b' - 'a' = 1 -> b는 index 1
    // // 'c' - 'a' = 2 -> c는 index 2
    // }
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 26; i++) {
    // if (count[i] == 1)
    // sb.append((char) (i + 'a'));
    // // 인덱스를 다시 알파벳으로 변환
    // // 0 + 'a' = 'a'
    // // 1 + 'a' = 'b'
    // // 2 + 'a' = 'c'
    // }
    // return sb.toString();
    // }

}