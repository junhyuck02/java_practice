package programmers.ct_start.Day20;

public class Solution1R {
    public int solution(int[][] dots) {
        int width = 0, height = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            int x2 = dots[i][0];
            int y2 = dots[i][1];

            if (y1 == y2) {
                width = Math.abs(x1 - x2);
            }
            if (x1 == x2) {
                height = Math.abs(y1 - y2);
            }
        }
        return width * height;
    }
}
