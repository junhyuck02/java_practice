package SelfStudy.Day8;

import java.util.Scanner;

public class Solution4 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution4 sol = new Solution4();
        int n = 0, result = 0;

        while(true){
            System.out.print("n을 입력하세요: ");
            n = scanner.nextInt();
            if(n >= 1 && n <= 1000000){
                result = sol.solution(n);
                System.out.println(result);
                break;
            }
            else{
                System.out.println("다시 입력하세요.");
            }
        }
        scanner.close();
    }
}
