package 프로그래머스.레벨0.코딩_기초_트레이닝.Day06;

public class 수열과_구간_쿼리_2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int max = 1000000;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < max) {
                    max = arr[j];
                }
            }
            if (max == 1000000) {
                answer[i] = -1;
            } else {
                answer[i] = max;
            }

        }
        // System.out.println(queries[1].length);
        return answer;
    }
}
