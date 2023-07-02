package 프로그래머스.레벨0.코딩_기초_트레이닝.Day06;

public class 수열과_구간_쿼리_3 {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = new int[arr.length];

        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        // System.out.println(queries[0][1]);
        return arr;
    }
}
