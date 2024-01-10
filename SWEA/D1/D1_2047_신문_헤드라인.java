/*
알아두면 좋을 것 같다.
대상 문자열을 모두 대문자로 변환하는 String toUpperCase()
대상 문자열을 모두 소문자로 변환하는 String toLowerCase()
 */
package SWEA.D1;

import java.util.Scanner;

public class D1_2047_신문_헤드라인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Lower = sc.next();
        System.out.println(Lower.toUpperCase());
    }
}
