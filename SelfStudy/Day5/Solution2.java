package SelfStudy.Day5;

import java.util.Scanner;

public class Solution2 {
    public int[] solution(int money) {
        int[] answer = {};
        int count = money / 5500;
        int change = money % 5500;
        answer = new int[2];
        answer[0] = count;
        answer[1] = change;
        return answer;
    }

    public static void main(String[] args) {
        int money = 0;
        int arr[] = new int[2];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("돈을 입력하세요: ");
            money = scanner.nextInt();
            if (money > 0 && money <= 1000000) {
                arr =  new Solution2().solution(money);
                break;
            } else{
                System.out.println("다시 입력하세요.");
                continue;
            }
        }
        System.out.println("[" + arr[0] + ", " + arr[1] + "]");
        scanner.close();
    }
}
