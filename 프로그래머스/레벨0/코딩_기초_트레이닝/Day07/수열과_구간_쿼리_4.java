package 프로그래머스.레벨0.코딩_기초_트레이닝.Day07;

public class 수열과_구간_쿼리_4 {
    class Solution {
        public int[] solution(int[] arr, int[][] queries) {
            for (int i = 0; i < queries.length; i++) {
                for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                    if (j % queries[i][2] == 0) {
                        arr[j] = arr[j] + 1;
                    }
                }
            }
            return arr;
        }
    }
    
}
