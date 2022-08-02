package 스터디.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11659_구간_합_구하기_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 숫자 개수
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 질의 개수

        long S[] = new long[suNo + 1]; // 구간 합 배열

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) { // 숫자 개수 만큼 반복
            // 합 배열 생성하기
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) { // 질의 개수 만큼 반복
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken()); // 질의 범위 i
            int j = Integer.parseInt(stringTokenizer.nextToken()); // 질의 범위 j
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
