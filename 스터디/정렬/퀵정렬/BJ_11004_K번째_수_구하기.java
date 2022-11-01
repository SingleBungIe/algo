package 스터디.정렬.퀵정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11004_K번째_수_구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(A, 0, N - 1, K - 1);
        System.out.println(A[K - 1]);

    }

    private static void quickSort(int[] A, int S, int E, int K) {
        if (S < E) {
            int pivot = partition(A, S, E);
            if (pivot == K) // K번째 수가 pivot이면 더이상 구할 필요 없음
                return;
            else if (K < pivot) // K가 pivot보다 작으면 왼쪽 그룸만 정렬 수행하기
                quickSort(A, S, pivot - 1, K);
            else if (K > pivot) // K가 pivot보다 크면 오른쪽 그룸만 정렬 수행하기
                quickSort(A, pivot + 1, E, K);
        }
    }

    private static int partition(int[] A, int S, int E) {
        if (S + 1 == E) { // 시작 다음이 끝이면 (데이터가 2개인 경우)
            if (A[S] > A[E]) // 시작이 끝 보다 크면 스왑
                swap(A, S, E);
            return E; // S로 줘도 상관 없음
        }
        int M = (S + E) / 2;
        swap(A, S, M); // 중간 값을 맨 앞으로 이동
        int pivot = A[S]; // 맨 앞의 값이 피봇
        int i = S + 1, j = E; // 스타트 지점을 피봇 다음 값 으로
        while (i <= j) {
            while (pivot < A[j] && j > 0) { // 피봇이 끝에 값 보다 작고 0보다 크면 끝을 앞으로 이동
                j--;
            }
            while (pivot > A[i] && i < A.length - 1) { // 피봇이 시작보다 크고 && 끝에 인덱스 보다 작으면 (끝이 최소 하나 이상 존재 하기 때문에 길이 -1을 해줌)
                i++;
            }
            if (i <= j) { // 찾은 i와 j 스왑
                swap(A, i++, j--); // 스왑 후 계속 탐색 진행
            }
        }
        A[S] = A[j];
        A[j] = pivot;
        return j;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
