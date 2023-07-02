package 프로그래머스.레벨0.코딩_기초_트레이닝.Day06;

public class 수_조작하기_1 {
    public int solution(int n, String control) {
        int answer = n;
        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') {
                answer += 1;
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a') {
                answer -= 10;
            }
        }
        return answer;
    }
}
