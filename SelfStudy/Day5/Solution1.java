package SelfStudy.Day5;

import java.util.Scanner;

public class Solution1 {
    public int solution(int price) {
        int answer = 0;
        if(price >= 100000){
            price *= 0.95;
            answer = (int) price;
        } else if(price >= 300000){
            price *= 0.9;
            answer = (int) price;
        } else if(price >= 500000){
            price *= 0.8;
            answer = (int) price;
        }
        return answer;
    }

    public static void main(String[] args) {
        int price = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("가격을 입력하세요: ");
            price = scanner.nextInt();

            if(price >= 10 && price <= 1000000 && price % 10 == 0){

            } else{
                System.out.println("다시 입력하세요");
                continue;
            }   

        }
    }
}
