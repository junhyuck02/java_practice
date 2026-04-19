package SelfStudy.Day3;

import java.util.Scanner;

public class Solution3 {
    public int solution(int[] array) {
        int answer = 0, max = 0;
        int countArr[] = new int[1000];
        for(int i = 0; i < array.length; i++){
            countArr[array[i]]++; // array에 있는 값이 countArr의 인덱스
        }
        for(int i = 0; i < countArr.length; i++){
            if(max < countArr[i]){
                max = countArr[i];
                answer = i;
            } else if(max == countArr[i]){
                answer = -1;
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

            if(size > 0 && size < 100){
                numbers = new int[size];
                for(int i = 0; i < numbers.length; i++){
                    System.out.print("배열의 요소를 입력하세요: ");
                    int check = scanner.nextInt();

                    if(check >= 0 && check < 1000){
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
        int result = new Solution3().solution(numbers);
        System.out.println("최빈값은: " + result + "입니다.");
        scanner.close();
    }
}
