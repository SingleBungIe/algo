package Do_it.자료구조;

import java.util.*;

public class BJ_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        Arrays.sort(A,Collections.reverseOrder());
        int max = A[0];

        System.out.println(sum * 100.0 / max / N);
    }
}


/*
80 / 80 * 100 + 60 / 80 * 100 + 40 / 80 * 100
(80 / 80 * 100 + 60 / 80 * 100 + 40 / 80 * 100)

160 / 80 * 100 / 3
200


 */

