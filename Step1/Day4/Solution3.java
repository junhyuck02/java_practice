package SelfStudy.Day4;

import java.util.Scanner;

public class Solution3 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n < slice){
            answer = 1;
        } else if(n % slice == 0){
            answer = n / slice;
        } else{
            answer = (n / slice) + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("조각 수를 입력하세요:");
            int slice = scanner.nextInt();

            if(slice >= 2 && slice <= 10){

                while(true){
                    System.out.print("사람 수를 입력하세요: ");
                    int n = scanner.nextInt();
                    if(n >= 1 && n <= 100){
                        result = new Solution3().solution(slice,n);
                        System.out.println("필요한 피자는 " + result + "판입니다.");
                        break;
                    } else {
                        System.out.println("다시 입력하세요");
                        continue;
                    } 
                }
                break;
            } else{
                System.out.println("다시 입력하세요");
                continue;
            }
        }
        scanner.close();
    }
}
