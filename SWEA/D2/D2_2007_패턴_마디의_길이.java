/*
생각 보다 고민을 많이 한 문제였음.
마디의 길이를 하나씩 증가시키고
첫 문자부터 증가시킨 마디의 길이까지 문자열에 담는다.
증가시킨 마디의 끝 부터 다음에 나타날 동일한 마디의 길이까지 문자열에 담는다.
equals()함수를 통해 문자열을 비교하고
같으면 증가시킨 마디의 길이를 출력하고
break문을 사용해 빠져 나온다.
 */
package SWEA.D2;

import java.util.Scanner;

public class D2_2007_패턴_마디의_길이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String a = sc.next();
            for (int i = 1; i <= a.length(); i++) {// 마디의 길이를 하나 씩 증가
                String pattern = a.substring(0, i);// 첫 문자부터 증가한 마디의 길이까지 문자를 담는다.
                String tmp = a.substring(i, i + i);//증가한 마디의 길이 부터 똑같이 마디의 길이 만큼 더해 그 다음 올 문자의 길이를 예측한다 문자를 담는다.
                if (pattern.equals(tmp)) {
                    System.out.println("#" + test_case + " " + pattern.length());
                    break;
                }
            }
        }
    }
}