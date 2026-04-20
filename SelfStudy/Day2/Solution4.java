package SelfStudy.Day2;

import java.util.Scanner;

public class Solution4 {

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        int numbers[] = {};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("배열의 크기를 입력하세요 (1 ~ 1000): ");
            int size = scanner.nextInt();

            if(size >= 1 && size <= 1000){
                numbers = new int[size];
                for(int j = 0; j < numbers.length; j++){
                    System.out.print("배열의 요소를 입력하세요: ");
                    int check = scanner.nextInt();

                    if(check >= -10000 && check <= 10000){
                        numbers[j] = check;
                    } else {
                        System.out.println("다시 입력하세요");
                        j--;
                    }
                }
                numbers = new Solution4().solution(numbers);
                for(int i = 0; i < numbers.length; i++){
                    System.out.print(numbers[i] + " ");
                }
                break;
            }
            else {
                System.out.println("다시 입력하세요");
                continue;
            }
        }
        scanner.close();

        
    }

}
