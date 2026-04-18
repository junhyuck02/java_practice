package SelfStudy.Day1;

import java.util.Scanner;

public class Solution1 {

    public int solution(int num1, int num2){
        int result = 0;
        result = num1 + num2;
        return result;
    }
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int num1, num2, result = 0;

        while (true) {
            System.out.print("두 개의 정수를 입력하세요 (-50,000 ~ 50,000): ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000) {
                break;
            }
            System.out.println("다시 입력하세요.");
        }
            
        Solution1 s = new Solution1();
        result = s.solution(num1, num2);
        System.out.println("두 수의 합은: " + result + "입니다.");
        scanner.close();

    }

}
