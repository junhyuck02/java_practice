package SelfStudy.Day2;

import java.util.Scanner;

public class Solution3 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        int numer3 = numer1*denom2 + numer2*denom1;
        int denom3 = denom1*denom2;
        int gcd = 1;
        for(int i = 1; i <= Math.min(numer3, denom3); i++){
            if(numer3 % i == 0 && denom3 % i == 0){
                gcd = i;
            }
        }
        answer = new int[]{numer3/gcd, denom3/gcd};
        return answer;
    }
    public static void main(String[] args) {
        
        Scanner scanner  = new Scanner(System.in); 
        int numer1, denom1, numer2, denom2 = 0;
        int result[] = {};

        while (true) {
            System.out.print("첫 번째 분수의 분자를 입력하세요 (1 ~ 999): ");
            numer1 = scanner.nextInt();
            System.out.print("첫 번째 분수의 분모를 입력하세요 (1 ~ 999): ");
            denom1 = scanner.nextInt();
            System.out.print("두 번째 분수의 분자를 입력하세요 (1 ~ 999): ");
            numer2 = scanner.nextInt();
            System.out.print("두 번째 분수의 분모를 입력하세요 (1 ~ 999): ");
            denom2 = scanner.nextInt();
           
            if (numer1 > 0 && numer1 < 1000 && denom1 > 0 && denom1 < 1000 
                && numer2 > 0 && numer2 < 1000 && denom2 > 0 && denom2 < 1000) {
                break;
            }
            System.out.println("다시 입력하세요.");
        }
            
        Solution3 s = new Solution3();
        result = s.solution(numer1, denom1, numer2, denom2);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        scanner.close();

    }
}

