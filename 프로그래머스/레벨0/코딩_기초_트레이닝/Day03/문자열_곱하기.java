package 프로그래머스.레벨0.코딩_기초_트레이닝.Day03;

public class 문자열_곱하기 {
    public String solution(String my_string, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }
}
