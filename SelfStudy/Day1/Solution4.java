package SelfStudy.Day1;

import java.util.Scanner;

public class Solution4 {

    public int solution(int num1, int num2){
        int result = 0;
        result = num1 / num2;
        return result;
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
            
        Solution4 s = new Solution4();
        result = s.solution(num1, num2);
        System.out.println("num1을 num2로 나눈 몫은: " + result + "입니다.");
        scanner.close();

    }

}
