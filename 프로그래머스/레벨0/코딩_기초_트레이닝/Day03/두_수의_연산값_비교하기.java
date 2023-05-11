package 프로그래머스.레벨0.코딩_기초_트레이닝.Day03;

public class 두_수의_연산값_비교하기 {
    public int solution(int a, int b) {
        int case1 = Integer.valueOf("" + a + b);
        int case2 = 2 * a * b;

        return case1 > case2 ? case1 : case2;
    }
}
