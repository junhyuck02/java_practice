package SelfStudy.Day12;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    public int[] solution(String my_string) {
        int[] answer = {};
        String[] arr = my_string.split("");
        String nums = "";
    
        for(String s : arr){
            if(Character.isDigit(s.charAt(0))){
                nums += s;
            }
        }
        answer = new int[nums.length()];
        String[] arr2 = nums.split("");
        for(int i = 0; i < arr2.length; i++){
            answer[i] = Integer.parseInt(arr2[i]);
        }
        Arrays.sort(answer);
        /* 
        String onlyNums = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[onlyNums.length()];
        for (int i = 0; i < onlyNums.length(); i++) {
            answer[i] = onlyNums.charAt(i) - '0';
        }
        Arrays.sort(answer); */

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution2 sol = new Solution2();
        String input = "";

        while (true) {
            System.out.println("문자열을 입력하세요:");
            input = scanner.nextLine();

            int len = input.length();
            if (len >= 1 && len <= 100) {
                if (input.matches("^[a-z0-9]*$")) {

                    if (input.matches(".*[0-9].*")) {
                        break;
                    } else {
                        System.out.println("숫자가 최소 하나 이상 포함되어야 합니다.");
                    }
                } else {
                    System.out.println("소문자와 숫자만 입력 가능합니다.");
                }
            } 
            else {
                System.out.println("길이는 1에서 100 사이여야 합니다.");
            }
        }

        int[] result = sol.solution(input);
        System.out.println("정렬된 숫자 배열: " + Arrays.toString(result));

        scanner.close();
    }


}
