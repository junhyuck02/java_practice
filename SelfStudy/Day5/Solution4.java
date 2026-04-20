package SelfStudy.Day5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            reverse[i] = num_list[num_list.length - 1 - i];
        }
        return reverse;
    }
    public static void main(String[] args) {
        int numbers[] = {};
        int reverse[] = {};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("배열의 크기를 입력하세요: ");
            int size = scanner.nextInt();

            if(size >= 1 && size <= 1000){
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
        reverse = new Solution4().solution(numbers);
        System.out.println(Arrays.toString(reverse));
        scanner.close();
    }
}
