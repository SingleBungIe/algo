package 스터디.정렬;

import java.util.Scanner;

public class BJ_2750_수_정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        // 버블정렬
        for (int i = 0; i < N - 1; i++) { // 루프가 몇 번 도는지
            for (int j = 0; j < N - 1 - i; j++) { // 루프가 돌 때 마다 늘어나는 정렬된 데이터 영역을 빼줘야 한다.
                if (A[j] > A[j + 1]) { // (SWAP) 현재A 배열의 값보다 1칸 오른쪽 배열의 값이 더 작으면 두 수 바꾸기
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
