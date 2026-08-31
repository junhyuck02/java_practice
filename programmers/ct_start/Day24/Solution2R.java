package programmers.ct_start.Day24;

public class Solution2R {
    public String solution(String bin1, String bin2) {

        // 방법 1
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        // bin1,2를 2진수 문자열로 해석해서 int로 변환
        return Integer.toBinaryString(sum);
        // 결과를 다시 2진 문자열로 변환

        // // 방법 2
        // StringBuilder sb = new StringBuilder();
        // int i = bin1.length() - 1;
        // int j = bin2.length() - 1;
        // // i, j 둘 다 마지막 인덱스(1의 자리)를 가리킨다
        // int carry = 0; // 자리 올림 값

        // while (i >= 0 || j >= 0 || carry != 0) {
        // // i >= 0 bin1에 아직 처리 안한 자리가 남음
        // // j >= 0 bin2에 아직 처리 안한 자리가 남음
        // // carry != 0 두 문자열 다 끝났어도 마지막에 자리올림이 남아있으면 한 자리 더 처리해야함
        // int d1 = (i >= 0) ? bin1.charAt(i) - '0' : 0;
        // int d2 = (j >= 0) ? bin2.charAt(j) - '0' : 0;

        // int sum = d1 + d2 + carry;
        // sb.append(sum % 2); // 이번 자리 결과
        // carry = sum / 2; // 다음 자리로 넘길 carry

        // i--;
        // j--;
        // }

        // return sb.reverse().toString();
        // 으아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ
    }

}
