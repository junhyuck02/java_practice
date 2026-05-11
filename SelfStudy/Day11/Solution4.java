package SelfStudy.Day11;

import java.util.Scanner;

public class Solution4 {
    public int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= 10; i++){
            if(factorial(i) <= n){
                answer = i;
            } else {
                break; 
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while(true){
            System.out.print("n을 입력하세요: ");
            n = scanner.nextInt();
            if(n > 0 && n <= 3628800){
                int result = sol.solution(n);
                System.out.println(result);
                break;
            }
            else{
                System.out.println("다시 입력하세요");
            }
        }
        scanner.close();
    }
}
