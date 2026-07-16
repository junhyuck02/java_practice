package Step1.Day19;

import java.util.ArrayList;
import java.util.List;

public class Solution2R {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            // 마지막 조각이 n보다 짧을 수 있는 경우를 대비
            list.add(my_str.substring(i, end));
            // i부터 end 직전까지 문자열을 자른다
        }
        return list.toArray(new String[0]);
        // new String[0]은 타입 정보를 알려주기 위한 빈 배열이고, 실제 크기는 toArray가 알아서 리스트 크기에 맞게 만들어줌
    }
}
