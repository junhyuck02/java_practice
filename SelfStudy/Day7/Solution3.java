package SelfStudy.Day7;

import java.util.Scanner;

public class Solution3 {
    public int solution(int n, int k) {
        int  total = 0;
        total = n * 12000 + k * 2000;
        if(n >= 10){
            return total - ((n / 10)  * 2000);
        } else{
            return total;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, k = 0;
        while(true){
            System.out.print("몇인분을 시킬건가요:");
            n = scanner.nextInt();
            if(n > 0 && n < 1000){
                while (true) {
                    System.out.print("음료수는 몇개: ");
                    k = scanner.nextInt();
                    if(k >= (n/10) && k < 1000){
                        Solution3 sol = new Solution3();
                        System.out.println(sol.solution(n, k));
                        break;
                    }
                    else {
                        System.out.println("다시 입력하세요.");
                    }
                }
                break;
            } else {
                System.out.println("다시 입력하세요.");
                continue;
            }
        }
        scanner.close();
    }
}
