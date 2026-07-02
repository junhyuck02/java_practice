package SelfStudy.Day6;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                answer[0]++;
            } else{
                answer[1]++;
            }
        }
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
                        System.out.println("다시 입력하세요");
                        i--;
                    }
                }
                break;
                    
            } else {
                System.out.println("다시 입력하세요");
                continue;
            }
            
        }
        int result[] = new Solution3().solution(numbers);
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
