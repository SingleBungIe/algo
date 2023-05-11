package 프로그래머스.레벨0.코딩_기초_트레이닝.Day03;

public class 더_크게_합치기 {
    public int solution(int a, int b) {
        int answer = 0;
        String case1 = "";
        String case2 = "";

        String.valueOf(a);
        String.valueOf(b);

        case1 = String.valueOf(a) + String.valueOf(b);
        case2 = String.valueOf(b) + String.valueOf(a);

        if (Integer.valueOf(case1) > Integer.valueOf(case2)) {
            answer = Integer.valueOf(case1);
        } else {
            answer = Integer.valueOf(case2);
        }



        return answer;
    }
}
