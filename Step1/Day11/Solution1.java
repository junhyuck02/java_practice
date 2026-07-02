package SelfStudy.Day11;

import java.util.Scanner;

public class Solution1 {
    public int solution(int[] box, int n) {
        int answer = 0;
        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 sol = new Solution1();

        int[] box = new int[3];
        int n = 0;

        String[] labels = {"가로", "세로", "높이"};
        for (int i = 0; i < 3; i++) {
            while (true) {
                System.out.print("상자의 " + labels[i] + " 길이를 입력하세요 (1~100): ");
                box[i] = scanner.nextInt();
                if (box[i] >= 1 && box[i] <= 100) {
                    break;
                } else {
                    System.out.println("1에서 100 사이의 숫자를 입력해주세요.");
                }
            }
        }

        while (true) {
            System.out.print("주사위 한 변의 길이 n을 입력하세요 (1~50): ");
            n = scanner.nextInt();

            if (n >= 1 && n <= 50) {
                if (n <= box[0] && n <= box[1] && n <= box[2]) {
                    break;
                } else {
                    System.out.println("다시 입력해주세요.");
                }
            } else {
                System.out.println("n은 1에서 50 사이의 숫자여야 합니다.");
            }
        }

        int result = sol.solution(box, n);
        System.out.println("상자에 들어갈 수 있는 최대 주사위 개수: " + result + "개");

        scanner.close();
    }

}
