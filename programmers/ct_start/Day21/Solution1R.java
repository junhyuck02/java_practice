package programmers.ct_start.Day21;

public class Solution1R {
    public int solution(String my_string) {
        int answer = 0;
        // 한자리 숫자가 아닌 십의 자리 이상이 연속된 숫자를 임시로 모아두는 그릇
        StringBuilder num = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                num.append(c); // 뒤에 나오는게 숫자면 계속 이어붙임

            } else { // 이제 숫자가 아니라 뒤에 문자가 나왔다면
                if (num.length() > 0) {
                    answer += Integer.parseInt(num.toString());
                    // 모아둔 숫자가 있으면 정수로 변환해서 더한다
                    num.setLength(0); // num을 다시 빈 상태로 초기화
                }
            }
        }

        // 만약 문자열의 끝이 숫자로 끝나는 경우 마지막 처리
        if (num.length() > 0) {
            answer += Integer.parseInt(num.toString());
        }
        return answer;
    }
}

// -- 방법 2 --
// // 정규식을 사용하려면 이 두 클래스가 필요하다
// import java.util.regex.Matcher;
// // 그 규칙을 실제 문자열에 적용해서 매칭되는 부분을 찾아주는 클래스
// import java.util.regex.Pattern;
// // 정규식 규칙 자체를 나타내는 클래스

// class Solution {
// public int solution(String my_string) {
// int answer = 0;

// Pattern pattern = Pattern.compile("\\d+"); // 숫자가 1개 이상 연속으로 이어진 덩어리
// // 문자열로 된 정규식 규칙을 실제로 사용할 수 있는 Pattern 객체로 컴파일(변환)한다
// // \d: 숫자 한글자를 의미하는 정규식 기호인데 자바 문자열 안에서는 이스케이프 처리해야해서 \\d로 작성
// // +: 바로 앞의 패턴이 1개 이상 연속으로 반복된다는 뜻

// Matcher matcher = pattern.matcher(my_string);
// // 방금 만든 규칙(pattern)을 실제 대상 문자열인 my_string에 적용할 준비를 하는 단계
// // matcher는 문자열을 처음부터 훑으면서 패턴에 맞는 부분을 하나씩 찾아주는 역할을 한다

// while (matcher.find()) { // 숫자 덩어리를 찾아서 그 위치로 이동한다
// answer += Integer.parseInt(matcher.group());
// // group은 find로 찾은 문자열을 그대로 갖고오는 것
// }

// return answer;
// }
// }

// -- 방법 3 --
// class Solution {
// public int solution(String my_string) {
// int answer = 0;

// String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
// // 알파벳을 전부 공백으로 바꾸고 공백을 기준으로 문자열을 잘라서 배열로 만든다

// for (String s : str) {
// if (!s.equals(""))
// answer += Integer.valueOf(s);
// }

// return answer;
// }
// }