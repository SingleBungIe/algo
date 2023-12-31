package 프로그래머스.레벨0.코딩_기초_트레이닝.Day07;

public class 카운트_업 {
    class Solution {
        public int[] solution(int start, int end) {
            int resultLen = end - start + 1;
            int[] answer = new int[resultLen];
            int cnt = 0;
            for (int i = start; i <= end; i++) {
                answer[cnt++] = i;
            }
            return answer;
        }
    }
}
