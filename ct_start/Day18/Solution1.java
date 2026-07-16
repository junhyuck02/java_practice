package Step1.Day18;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int solution(String str1, String str2) {
        List<String> arr = new ArrayList<>();
        arr.add(str1);
        if (str1.contains(str2)) {
            return 1;
        } else
            return 2;
    }
    // return (str1.contains(str2)? 1: 2);
}
