package Step1.Day9;

import java.util.Scanner;

public class Solution1 {

    public int solution(int hp) {
        int num1 = hp / 5;
        int num2 = (hp % 5) / 3;
        int num3 = (hp % 5) % 3;
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution1 sol = new Solution1();

        while (true) {
            System.out.print("hp를 입력하세요:");
            int hp = scanner.nextInt();

            if (hp <= 0 || hp > 1000) {
                System.out.println("다시 입력하세요.");
            } else {
                System.out.println(sol.solution(hp));
                break;
            }
        }
        scanner.close();

    }
}
