package programmers.ct_start.Day22;

public class Solution2R {
    public int solution(int[][] dots) {
        // 점 A, B, C, D 매핑 (가독성을 위해 변수로 지정)
        // dots[0] = A, dots[1] = B, dots[2] = C, dots[3] = D

        // 1. A-B 와 C-D 가 평행한지 확인
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }

        // 2. A-C 와 B-D 가 평행한지 확인
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) {
            return 1;
        }

        // 3. A-D 와 B-C 가 평행한지 확인
        if (isParallel(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }

        // 어떤 조합도 평행하지 않으면 0 반환
        return 0;
    }

    // 두 선분이 평행한지 확인하는 메서드 (dy1 * dx2 == dy2 * dx1)
    private boolean isParallel(int[] p1, int[] p2, int[] p3, int[] p4) {
        int dy1 = p2[1] - p1[1]; // 첫 번째 선분의 y증가량 (y2 - y1)
        int dx1 = p2[0] - p1[0]; // 첫 번째 선분의 x증가량 (x2 - x1)

        int dy2 = p4[1] - p3[1]; // 두 번째 선분의 y증가량 (y4 - y3)
        int dx2 = p4[0] - p3[0]; // 두 번째 선분의 x증가량 (x4 - x3)

        // 기울기 비교 (나눗셈 대신 곱셈 사용으로 0으로 나누기 예외 방지)
        return (dy1 * dx2) == (dy2 * dx1);
    }
}
