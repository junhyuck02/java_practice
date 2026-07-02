package SelfStudy.Day6;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int n = scanner.nextInt();
            
            if(n >= 1 && n <= 10){ // repeat() 사용해보기
                for(int i = 1; i <= n; i++){ 
                    for(int j = 0; j < i; j++){ 
                        System.out.print("*");
                    }
                    System.out.println(); 
                }
                break;
            } else{
                System.out.println("다시 입력하세요.");
                continue;
            }
            
        }
        scanner.close();
    }
}
