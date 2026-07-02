package SelfStudy.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i = 0;i < numbers.length;i++){
                if(i == numbers.length - 1){
                    answer[0] = numbers[i];
                    break;
                }
                answer[i + 1] = numbers[i];
            }
        } else if(direction.equals("left")){
            answer[numbers.length - 1] = numbers[0];
    
            for(int i = 1; i < numbers.length; i++){
                answer[i - 1] = numbers[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution4 sol = new Solution4();
        int len = 0;

        while (true) {
            System.out.print("배열의 길이를 입력하세요: ");
            len = scanner.nextInt();
            
            if (len >= 3 && len <= 20) {
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }

        int[] numbers = new int[len];

        System.out.println("원소들을 입력하세요:");
        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.nextLine();

        String direction = "";
        while (true) {
            System.out.print("회전 방향을 입력하세요 (left/right): ");
            direction = scanner.nextLine();
            
            if (direction.equals("left") || direction.equals("right")) {
                break;
            } else {
                System.out.println("left 또는 right만 입력 가능합니다.");
            }
        }

        int[] result = sol.solution(numbers, direction);
        System.out.println("회전 결과: " + Arrays.toString(result));

        scanner.close();
    }
    
}
