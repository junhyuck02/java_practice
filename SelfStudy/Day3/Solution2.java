package SelfStudy.Day3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }
    public static void main(String[] args) {
        int numbers[] = {};

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("배열의 크기를 입력하세요: ");
            int size = scanner.nextInt();

            if(size > 0 && size < 100 && (size % 2 == 1)){
                numbers = new int[size];
                for(int i = 0; i < numbers.length; i++){
                    System.out.print("배열의 요소를 입력하세요: ");
                    int check = scanner.nextInt();

                    if(check > -1000 && check < 1000){
                        numbers[i] = check;
                    } else {
                        System.out.println("다시 입력하세요");
                        break;
                    }
                    
                }
                break;
                    
            } else {
                System.out.println("다시 입력하세요");
            }
            
        }
        int result = new Solution2().solution(numbers);
        System.out.println("중앙값은: " + result + "입니다.");
        scanner.close();
    }
}
