package programmers.ct_start.Day24;

import java.util.Arrays;

public class Solution3 {
    public int solution(String before, String after) {
        int count = 0;
        String[] arr1 = before.split("");
        String[] arr2 = before.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].equals(arr2[i])) {
                count++;
            }
        }
        if (count == arr1.length) {
            return 1;
        } else {
            return 0;
        }
    }

    // char[] arr1 = before.toCharArray();
    // char[] arr2 = after.toCharArray();
    // Arrays.sort(arr1);
    // Arrays.sort(arr2);
    // boolean isAnagram = Arrays.equals(arr1, arr2);
}
