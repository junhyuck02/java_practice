package programmers.ct_start.Day25;

public class Solution1R {
    class Solution {
        public int solution(String A, String B) {
            return (B + B).indexOf(A);
            // 문자열 2개를 이어붙인 문자열안에는 모든 회전 형태가 부분 문자열로 다 들어있다
        }
    }
}
