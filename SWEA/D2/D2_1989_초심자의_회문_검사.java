/*
StringBuffer객체의 reverse()메소드를 활용하면 쉽게 풀 수 있는 문제였다.
reverse()메소드는 StringBuffer객체를 리턴하기 때문에
toString()메소드를 사용하여 String으로 변환해주어야 한다.
 */

package SWEA.D2;

import java.util.Scanner;

public class D2_1989_초심자의_회문_검사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            String palindrome = sc.next();
            if (new StringBuffer(palindrome).reverse().toString().equals(palindrome))
                System.out.printf("#%d %d\n", test_case, 1);
            else
                System.out.printf("#%d %d\n", test_case, 0);
        }
    }
}
