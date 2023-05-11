package 프로그래머스.레벨0.코딩_기초_트레이닝.Day04;

public class n의_배수 {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
