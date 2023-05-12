package 프로그래머스.레벨0.코딩_기초_트레이닝.Day04;

public class 조건_문자열 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals("<") && eq.equals("=")) {
            if (n <= m) {
                answer = 1;
            }
        } else if (ineq.equals(">") && eq.equals("=")) {
            if (n >= m) {
                answer = 1;
            }
        } else if (ineq.equals(">") && eq.equals("!")) {
            if (n > m) {
                answer = 1;
            }
        } else if (ineq.equals("<") && eq.equals("!")) {
            if (n < m) {
                answer = 1;
            }
        }
        return answer;
    }
}
