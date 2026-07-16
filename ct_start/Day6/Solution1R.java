package Step1.Day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1R {
    public String solution(String my_string) {
        List<String> list = Arrays.asList(my_string.split(""));
        Collections.reverse(list);
        String reversed = String.join("", list);
        return reversed;
    }

}
