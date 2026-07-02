package SelfStudy.Day5;

import java.util.Scanner;

public class Solution3 {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
    public static void main(String[] args) {
        int age = 0, year = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("나이를 입력하세요: ");
            age = scanner.nextInt();

            if(age <= 120  && age > 0){
                year = new Solution3().solution(age);
                break;
            } else {
                System.out.println("다시 입력하세요.");
                continue;
            }
        }
        System.out.println("년도는 " + year + " 입니다.");
        scanner.close();
    }
}
