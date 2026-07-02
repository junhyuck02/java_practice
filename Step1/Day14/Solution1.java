package SelfStudy.Day14;

import java.util.Scanner;

public class Solution1 {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(array[0] - n); // 첫번째 인덱스로 설정

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);
        
       // 거리는 더 가깝고 같으면 더 작은 수로
        if (diff < minDiff || (diff == minDiff && array[i] < answer)) {
            minDiff = diff;
            answer = array[i];
        }
    }
        return answer;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int size = 0;
            System.out.print("배열의 크기를 입력하세요 (1~100, 0 입력 시 종료): ");
            size = scanner.nextInt();
            
            if (size == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; 
            }
            
            if (size < 1 || size > 100) {
                System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
                continue; 
            }

            int[] array = new int[size];
            System.out.print("배열의 요소를 입력하세요 (각 원소 1~100): ");
            for (int i = 0; i < size; i++) {
                int element = scanner.nextInt();
                if (element >= 1 && element <= 100) {
                    array[i] = element;
                } else {
                    System.out.println("잘못된 값입니다. 1~100 사이의 값을 입력하세요.");
                    i--;
                }
            }

            int n = 0;
            while (true) {
                System.out.print("비교할 정수 n을 입력하세요 (1~100): ");
                n = scanner.nextInt();
                if (n >= 1 && n <= 100) 
                    break;
                System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
            }

            Solution1 sol = new Solution1();
            int result = sol.solution(array, n);
            System.out.println("결과: " + result);
        }
        scanner.close();
    }
}
