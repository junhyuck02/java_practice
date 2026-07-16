package Step1.Day9;

public class Solution1 {

    public int solution(int hp) {
        int num1 = hp / 5;
        int num2 = (hp % 5) / 3;
        int num3 = (hp % 5) % 3;
        return num1 + num2 + num3;
    }
}
