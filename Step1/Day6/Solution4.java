package SelfStudy.Day6;

import java.util.Scanner;

public class Solution4 {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        for(int i = 0; i < arr.length; i++){
            String s = arr[i];
            answer += s.repeat(n);
        }
        return answer;
    }
    public static void main(String[] args) {
        String s = "";
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("문자열을 입력하세요: ");
            s = scanner.nextLine();
            if(s.length() >= 2 && s.length() <= 5){
                while(true){
                    System.out.print("반복할 횟수를 입력하세요: ");
                    n = scanner.nextInt();
                    if(n >= 2 && n <= 10){
                        String result = new Solution4().solution(s, n);
                        System.out.println(result);
                        break;
                    } else{
                        System.out.println("다시 입력하세요");
                    }
                }
                break;
            }
            else{
                System.out.println("다시 입력하세요");
                continue;
            }
        }
        scanner.close();
    }
}
