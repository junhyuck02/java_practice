package programmers.ct_start.Day23;

import java.util.Arrays;

public class Solution1R {
    public int[] solution(int[] numlist, int n) {
        // [1,2,3,4,5] n = 4
        return Arrays.stream(numlist).boxed().sorted((a, b) -> {
            // int배열 numlist를 IntStream으로 변환하고 IntStream은 기본형이라 Comparator를 못써서
            // boxed를 이용해 객체인 Integer로 감싼다 그래야 다음 줄의 sorted()에서 Comparator를 쓸 수 있다
            // Comparator - compare()을 지금 여기서는 람다식으로 작성한거임
            // 음수를 반환 = a < b, 양수를 반환 = a > b, 0을 반환 = 둘이 같다

            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);

            if (distA != distB) {
                // 거리가 다르면 거리가 작은 쪽이 앞으로 오도록 정렬한다
                return distA - distB;
            }

            return b - a; // 거리가 같으면 더 큰 값을 앞에 둔다
        }).mapToInt(Integer::intValue).toArray();
        // Stream<Integer>를 다시 IntStream으로 변환하고 배열로 되돌린다
    }

    // ㅁㄹㅁㄹㅁㄹㅁㅁㅁㄹㅁㄹㅁㄹㄹㅁㄹㅁㄹㅁㅁ

}
