package SelfStudy.Day12;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution4 {
    public int[] solution(int n) {
        int[] answer = {};
        Set<Integer> set = new LinkedHashSet<>();
        int divisor = 2;

        while(n > 1){
            if(n % divisor == 0){
                set.add(divisor);
                n = n / divisor;
            }else{
                divisor++;
            }
        }
        answer = new int[set.size()];
        int index = 0;
        for(int num : set){
            answer[index++] = num;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution4 sol = new Solution4();
        int n = 0;
        int[] result = {};

        while(true){
            System.out.print("n을 입력하세요:");
            n = scanner.nextInt();
            if(n >= 2 && n <= 10000){
                result = sol.solution(n);
                System.out.println(Arrays.toString(result));
                break;
            } else{
                System.out.println("다시 입력하세요.");
            }
        }
        scanner.close();

    }
}
