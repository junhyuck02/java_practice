package SelfStudy.Day4;

import java.util.Scanner;

public class Solution1 {
    public int solution(int n) {
        int answer = 0;
        if(n < 7){
            answer = 1;
        } 
        else if(n % 7 == 0){
            answer = n / 7;
        } else{
            answer = (n / 7) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("사람 수를 입력하세요: ");
            int num = scanner.nextInt();
            if(num >= 1 && num <= 100){
                result = new Solution1().solution(num);
                System.out.println("필요한 피자는 " + result + "판입니다.");
                break;
            } else {
                System.out.println("다시 입력하세요");
            }   
        }
        scanner.close();
    }

}
