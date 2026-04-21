package SelfStudy.Day7;

import java.util.Scanner;

public class Solution4 {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int num = 0, total = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("n 을 입력하세요: ");
            num = scanner.nextInt();
            if (num > 0 && num <= 1000) {
                total = new Solution4().solution(num);
                System.out.println("n 이하의 짝수의 합계는 " + total + "입니다.");
                break;
            } else{
                System.out.println("다시 입력하세요.");
                continue;
            }
        }
        scanner.close();

    }
}
