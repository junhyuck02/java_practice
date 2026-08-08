package programmers.ct_start.Day22;

public class Solution1R {
    public int solution(int n) {
        int answer = 0; // 지금 검사 중인 숫자
        int count = 0; // 조건을 통과한 숫자를 몇 개 찾았는지 세는 숫자
        while (count < n) {
            answer++;
            if (answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
                count++;
            }
        }
        return answer;
    }
}
// 핵심 아이디어: 1부터 숫자를 하나씩 늘려가면서, "3의 배수도 아니고 3이 들어가지도 않는 숫자"만 골라서 센다.
// n개를 세는 순간의 숫자가 답.
// 몇 번째 살아남은 숫자가 정답이냐 를 직접 하나씩 세어가며 찾는 방식