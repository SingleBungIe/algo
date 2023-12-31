package 프로그래머스.레벨0.코딩_기초_트레이닝.Day07;

import java.util.*;

public class 콜라츠_수열_만들기 {

    class Solution {
        public List<Integer> solution(int n) {
            List<Integer> list = new ArrayList<>();
            list.add(n);
            while(n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    list.add(n);
                } else {
                    n = 3 * n + 1;
                    list.add(n);
                }
            }

//         int[] answer = new int[list.size()];

//         for (int i = 0; i < list.size(); i++) {
//             answer[i] = list.get(i);
//         }


            return list;
        }
    }
}
