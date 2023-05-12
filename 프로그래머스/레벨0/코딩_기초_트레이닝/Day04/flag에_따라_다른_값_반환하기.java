package 프로그래머스.레벨0.코딩_기초_트레이닝.Day04;

public class flag에_따라_다른_값_반환하기 {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        return answer;
    }
}
