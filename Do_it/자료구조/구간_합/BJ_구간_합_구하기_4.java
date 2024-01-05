package Do_it.자료구조.구간_합;
import java.util.*;
public class BJ_구간_합_구하기_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] S = new int[N+1];

        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }

        for (int q = 0; q < M; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(S[j] - S[i-1]);
        }
    }
}
