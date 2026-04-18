package SelfStudy.Day2;

import java.util.Scanner;

class Solution1 {
    public int solution(int num1, int num2) {
        double result = (double)num1 / (double)num2;
        int answer = (int)(result * 1000);
        return answer;
    }

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in); 
        int num1, num2, result = 0;

        while (true) {
            System.out.print("두 개의 정수를 입력하세요 (1 ~ 100): ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
                break;
            }
            System.out.println("다시 입력하세요.");
        }
            
        Solution1 s = new Solution1();
        result = s.solution(num1, num2);
        System.out.println("정답은: " + result + "입니다.");
        scanner.close();

    }


}
