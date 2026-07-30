package programmers.ct_start.Day21;

public class Solution2R {
    public int solution(int[][] board) {
        int n = board.length; // 행의 개수
        int m = board[0].length; // 열의 개수

        // 지뢰 체크 벡터
        boolean[][] danger = new boolean[n][m];
        // 지뢰 주위 방향 이동 벡터
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 }; // x 좌표
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 }; // y 좌표

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    danger[i][j] = true;
                    for (int d = 0; d < 8; d++) {
                        int x = i + dx[d]; // 찾은 지뢰의 x 좌표 i를 기준으로 좌표 계산
                        int y = j + dy[d]; // 찾은 지뢰의 y 좌표 j를 기준으로 좌표 계산

                        // 배열의 범위를 벗어나지 않도록 범위 체크
                        if (x >= 0 && x < n && y >= 0 && y < m) {
                            danger[x][y] = true;
                        }
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!danger[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
