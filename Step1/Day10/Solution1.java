package SelfStudy.Day10;

import java.util.Scanner;

public class Solution1 {
    public int solution(int[] dot) {
        int answer = 0;

        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        } else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        } else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        } else if(dot[0] > 0 && dot[1] < 0){
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        Scanner scanner = new Scanner(System.in);
        int[] dot = new int[2];

        while(true){
            System.out.print("x 좌표 입력: ");
            dot[0] = scanner.nextInt();
            System.out.print("y 좌표 입력: ");
            dot[1] = scanner.nextInt();

            if (dot[0] == 0 || dot[0] < -500 || dot[0] > 500) {
                System.out.println("다시 입력하세요");
                continue;
            }

            if (dot[1] == 0 || dot[1] < -500 || dot[1] > 500) {
                System.out.println("다시 입력하세요");
                continue;
            }

            System.out.println("결과: " + sol.solution(dot));
            break;
        }
        scanner.close();
    }

}
