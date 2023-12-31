package 프로그래머스.레벨0.코딩_기초_트레이닝.Day07;
import java.util.*;
public class 배열_만들기_4 {
    class Solution {
        public List<Integer> solution(int[] arr) {
            List<Integer> list = new ArrayList<>();

            int i = 0;
            while(i < arr.length) {
                if (list.isEmpty()) {
                    list.add(arr[i]);
                    i++;
                } else if(list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } else {
                    list.remove(list.size() - 1);
                }
            }

            return list;
        }
    }
}
