package 프로그래머스.레벨0.코딩_기초_트레이닝.Day06;

public class 수_조작하기_2 {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i-1] == 1) {
                answer += "w";
            } else if (numLog[i] - numLog[i-1] == 10) {
                answer += "d";
            } else if (numLog[i] - numLog[i-1] == -1) {
                answer += "s";
            } else {
                answer += "a";
            }
        }
        return answer;
    }
}
