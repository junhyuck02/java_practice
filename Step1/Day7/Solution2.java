package SelfStudy.Day7;

import java.util.Scanner;

public class Solution2 {
    public int solution(int angle) {
        if(angle > 0 && angle < 90){
            return 1;
        }
        else if(angle == 90){
            return 2;
        }
        else if(angle > 90 && angle < 180){
            return 3;
        }
        else if(angle == 180){
            return 4;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        int angle = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("각도를 입력하세요: ");
            angle = scanner.nextInt();
            if(angle >= 0 && angle <= 360){
                Solution2 sol = new Solution2();
                System.out.println(sol.solution(angle));
                break;
            } else {
                System.out.println("다시 입력하세요.");
                continue;
            }
        }
        scanner.close();
    }
}
