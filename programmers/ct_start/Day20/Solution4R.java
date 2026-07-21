package programmers.ct_start.Day20;

public class Solution4R {
    public String solution(String polynomial) {
        int xCount = 0, constant = 0;
        // +를 기준으로 분류
        String[] terms = polynomial.split(" \\+ ");

        for (String term : terms) {
            if (term.contains("x")) {
                if (term.equals("x")) {
                    xCount += 1;
                } else {
                    // x 앞의 계수 추출
                    String numStr = term.replace("x", "");
                    xCount += Integer.parseInt(numStr);
                }
            } else {
                // 상수
                constant += Integer.parseInt(term);
            }
        }
        StringBuilder sb = new StringBuilder();

        if (xCount > 0) {
            if (xCount == 1) {
                sb.append("x");
            } else {
                sb.append(xCount).append("x");
            }
        }
        if (constant > 0) {
            // 이미 x항이 존재한다면 " + "를 붙여줌
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }
        if (sb.length() == 0) {
            sb.append("0");
        }

        return sb.toString();
    }

    // 좋은 풀이법
    public String solution2(String polynomial) {
        int xCount = 0;
        int num = 0;

        for (String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "")
                + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }
}
