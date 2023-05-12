package 프로그래머스.레벨0.코딩_기초_트레이닝.Day05;

public class 등차수열의_특정한_항만_더하기 {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int increArr[] = new int [included.length];
        int increNum = a;
        for (int i = 0; i < included.length; i++) {
            increArr[i] = increNum;
            if (included[i]) {
                answer += increNum;
            }
            increNum += d;
        }
        return answer;
    }
}
