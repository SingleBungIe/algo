package 스터디.정렬.삽입정렬;

import java.util.Scanner;

public class BJ_11399_ATM_인출_시간_계산하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int S[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            int insert_point = i;
            int insert_value = A[i];
            for (int j = i - 1; j >= 0; j--) { // 삽입 위치 찾기
                if (A[j] < A[i]) { // 앞에 인덱스는 정렬이 되어 있으므로 앞에 값이 더 작은 경우 다음 탐색 진행
                    insert_point = j + 1;
                    break;
                }
                if (j == 0) { // 인덱스가 0일 경우 바교 할 수 있는 앞에 인덱스가 없기 때문에 insert_point를 0으로 바꿔준다.
                    insert_point = 0;
                }
            }
            for (int j = i; j > insert_point; j--) {
                A[j] = A[j - 1];
            }
            A[insert_point] = insert_value;
        }
        S[0] = A[0]; // 합 배열 만들기
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        int sum = 0; // 합 배열 총합 구하기
        for (int i = 0; i < N; i++) {
            sum += S[i];
        }
        System.out.println(sum);
    }
}
