package programmers.ct_start.Day22;

public class Solution3R {
    public int solution(int[][] lines) {
        int answer = 0;
        int offset = 100; // 좌표가 음수 나올 경우가 있으니 모든 좌표에 100을 더해서 양수로 만들어버리기
        int[] diff = new int[offset * 2 + 1]; // -100부터 100이니까 201칸 필요

        for (int[] line : lines) { // line은 선분 하나임
            // line=[0,5]면 line[0]=0(시작), line[1]=(끝)
            diff[line[0] + offset]++; // diff[100]에서 1을 더함
            diff[line[1] + offset]--; // dif[105]에서 1을 뺌
        } // 선분 3개의 시작점과 끝점에 표시를 남긴다

        int count = 0; // 지금 이 칸에 선분이 몇 개 덮여있나
        for (int d : diff) {
            count += d;
            // 칸을 지날 때 d가 +1이면 선분이 하나 시작된거니까 count 증가
            // d가 -1이면 선분이 하나 끝난거니까 count 감소
            // d가 0이면 아무 변화 없음
            if (count >= 2)
                answer++;
            // 2개 이상의 선분이 동시에 이 칸을 덮고 있으면 answer++로 겹친 길이를 늘린다
        }

        return answer;
    }
}
