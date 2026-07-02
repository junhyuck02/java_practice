package SelfStudy.Day4;

import java.util.Scanner;

public class Solution4 {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        answer = (double) sum / numbers.length; 
        return answer;
    }

    public static void main(String[] args) {
        int numbers[] = {};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("배열의 크기를 입력하세요: ");
            int size = scanner.nextInt();

            if(size >= 1 && size <= 100){
                numbers = new int[size];

                for(int i = 0; i < numbers.length; i++){
                    System.out.print("배열의 요소를 입력하세요: ");
                    int check = scanner.nextInt();

                    if(check >= 0 && check <= 1000){
                        numbers[i] = check;
                    } else {
                        System.out.println("다시 입력하세요.");
                        i--;
                    }
                }

                int sum = 0;
                for(int num : numbers){
                    sum += num;
                }
                if(sum % size == 0 || sum % size == size / 2) {
                    double average = new Solution4().solution(numbers);
                    System.out.println("평균값은: " + average + "입니다.");
                    break;
                } else {
                    System.out.println("평균이 .5나 .0으로 끝나지 않습니다. 처음부터 다시 시작하세요.");
                    break;
                }
                    
            } else {
                System.out.println("다시 입력하세요");
                continue;
            }
            
        }
        scanner.close();
    }
}
