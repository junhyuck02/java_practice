package SelfStudy.Day2;

import java.util.Scanner;

class Solution2 {
    public int solution(int num1, int num2) {
        if(num1 == num2){
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in); 
        int num1 = 0, num2 = 0, result = 0;

        while (true) {
            System.out.print("두 개의 정수를 입력하세요 (0 ~ 10000): ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 >= 0 && num1 <= 10000 && num2 >= 0 && num2 <= 10000) {
                break;
            }
            System.out.println("다시 입력하세요.");
        }
            
        Solution2 s = new Solution2();
        result = s.solution(num1, num2);
        System.out.println(result);
        scanner.close();

    }


}
