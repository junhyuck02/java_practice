package SelfStudy.Day9;

import java.util.Scanner;

public class Solution4 {

    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0){
            return 1;
        }

        long result = solution(balls - 1, share - 1);

        result = result * balls;
        result = result / share;

        return result;
    }
    
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("balls 개수를 입력하세요:");
            int balls = scanner.nextInt();
            System.out.print("share 개수를 입력하세요:");
            int share = scanner.nextInt();

            if(balls >= 1 && balls <= 30 && share >= 1 && share <= 30 && balls >= share){
                System.out.println(sol.solution(balls, share));
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        scanner.close();
    }
}
