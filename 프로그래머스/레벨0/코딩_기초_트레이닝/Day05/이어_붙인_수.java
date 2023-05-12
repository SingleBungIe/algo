package 프로그래머스.레벨0.코딩_기초_트레이닝.Day05;

public class 이어_붙인_수 {
    public int solution(int[] num_list) {
        String case1 = "";
        String case2 = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                case1 += num_list[i];
            } else {
                case2 += num_list[i];
            }
        }
        return Integer.valueOf(case1) + Integer.valueOf(case2);
    }
}
