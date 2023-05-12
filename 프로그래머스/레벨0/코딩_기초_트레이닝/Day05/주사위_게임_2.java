package 프로그래머스.레벨0.코딩_기초_트레이닝.Day05;

public class 주사위_게임_2 {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else if (a == b && b == c) {
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c);
        } else if (a == b || b == c || a == c) {
            answer = (a + b + c) * (a*a + b*b + c*c);
        }
        return answer;
    }
}
