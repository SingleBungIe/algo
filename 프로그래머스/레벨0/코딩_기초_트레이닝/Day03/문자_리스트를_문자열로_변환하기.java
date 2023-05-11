package 프로그래머스.레벨0.코딩_기초_트레이닝.Day03;

public class 문자_리스트를_문자열로_변환하기 {
    public String solution(String[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}
