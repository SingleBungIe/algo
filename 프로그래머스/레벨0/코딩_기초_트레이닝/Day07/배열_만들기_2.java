package 프로그래머스.레벨0.코딩_기초_트레이닝.Day07;
import java.util.*;
public class 배열_만들기_2 {
    class Solution {
        public int[] solution(int l, int r) {
            List<Integer> list = new ArrayList<>();
            for (int i = l; i <= r; i++) {
                String str = String.valueOf(i);
                int strLen = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '0' || str.charAt(j) == '5') {
                        strLen ++;
                    }
                }
                if (strLen == str.length()){
                    list.add(i);
                }
            }
            int answer[] = new int[list.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            if (answer.length == 0) {
                int[] empty = {-1};
                return empty;
            }

            return answer;
        }
    }
}
