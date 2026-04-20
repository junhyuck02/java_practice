package SelfStudy.Day5;

import java.util.Scanner;

public class Solution1 {
    public int solution(int price) {

        if(price >= 500000){
            return (int)(price*0.8);
        } 
        if(price >= 300000){
            return (int)(price*0.9);
        } 
        if(price >= 100000){
            return (int)(price*0.95);
        } 
        return price;
    }

    public static void main(String[] args) {
        int price = 0, result = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("가격을 입력하세요: ");
            price = scanner.nextInt();

            if(price >= 10 && price <= 1000000 && price % 10 == 0){
                Solution1 sol = new Solution1();
                result = sol.solution(price);
                System.out.println("지불해야할 금액은 " + result + "원 입니다.");
                break;
            } else{
                System.out.println("다시 입력하세요");
                continue;
            }   
        }
        scanner.close();
    }
}
