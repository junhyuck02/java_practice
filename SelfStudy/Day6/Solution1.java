package SelfStudy.Day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public String solution(String my_string) {
        List<String> list = Arrays.asList(my_string.split(""));
        Collections.reverse(list);
        String reversed = String.join("", list);
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 sol = new Solution1(); 

        while (true) {
            System.out.print("문자열을 입력하세요 (길이 1 ~ 1,000): ");
            String input = scanner.nextLine();

            if (input.length() >= 1 && input.length() <= 1000) {
                String result = sol.solution(input);
                System.out.println("뒤집힌 결과: " + result);
                break; 
            } else {
                System.out.println("입력 범위를 벗어났습니다. (현재 길이: " + input.length() + ")");
                continue;
            }
        }
        scanner.close(); 
    }

}
