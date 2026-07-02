package SelfStudy.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0] + sides[1] > sides[2]){
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution4 sol = new Solution4();
        int[] sides = new int[3];

        System.out.println("삼각형의 세 변의 길이를 입력하세요:");

        for(int i = 0; i < 3; i++) {
            sides[i] = scanner.nextInt();
            
            if (sides[i] < 1 || sides[i] > 1000) {
                System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
                i--; 
            }
        }
        
        int result = sol.solution(sides);
        System.out.println(result);
        
        scanner.close();
    }
}
