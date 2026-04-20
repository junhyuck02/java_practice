package SelfStudy.Day4;

import java.util.Scanner;

public class Solution2 { // 최소공배수를 구하고 6으로 나누기
    public int solution(int n) {
        int a = n;
        int b = 6;

        while (b != 0) { // 최대공약수 a
            int r = a % b;
            a = b;
            b = r;
        }
        return (n * 6 / a) / 6; // n / a 와 같음
        /*while (true) {
            if (6 * answer % n == 0) {
                return answer;
            }
            answer++;
        }*/
    }
    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("사람 수를 입력하세요: ");
            int n = scanner.nextInt();
            if(n >= 1 && n <= 100){
                result = new Solution2().solution(n);
                System.out.println("필요한 피자는 " + result + "판입니다.");
                break;
            } else {
                System.out.println("다시 입력하세요");
            }   
        }
        scanner.close();
    }

}
