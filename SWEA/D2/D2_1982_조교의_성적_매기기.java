package SWEA.D2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class D2_1982_조교의_성적_매기기 {
    static String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // 학생수
            int K = sc.nextInt(); // 학생의 번호
            double findK = 0.0;
            Double[] result = new Double[N];

            for (int i = 0; i < N; i++) {
                int midEx = sc.nextInt();
                int finalEx = sc.nextInt();
                int work = sc.nextInt();
                double sum = 0.35 * midEx + 0.45 * finalEx + 0.20 * work; // 총점
                result[i] = sum;
                if (i + 1 == K)
                    findK = sum;
            }

            Arrays.sort(result, Collections.reverseOrder());
            int index = 0;
            for (int i = 0; i < N; i++) {
                if (result[i] == findK)
                    index = i;
            }
            index /= (N / 10);
            System.out.printf("#%d %s\n", test_case, score[index]);
        }
    }
}
