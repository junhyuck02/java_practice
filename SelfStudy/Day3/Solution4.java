package SelfStudy.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public int[] solution(int n) {
        int[] answer = {};
        int num = 1;
        if(n % 2 == 0){
            answer = new int[n/2];
        } else{
            answer = new int[n/2 + 1];
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = num;
            num += 2;
        }
        return answer;
    }
    public static void main(String[] args) {
        int numbers[] = {};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("숫자를 입력하세요: ");
            int num = scanner.nextInt();
            if(num >= 1 && num <= 100){
                numbers = new Solution4().solution(num);
                break;
            } else {
                System.out.println("다시 입력하세요");
                continue;
            }   
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
