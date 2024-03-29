package StepUP.이진탐색;

import java.util.Scanner;

public class 나무_자르기 {
    static int collect, n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = 2000000000;

        binarySearch(arr, start, end);
        System.out.println(collect);
    }

    static void binarySearch(int arr[], int s, int e) {
        if (s > e) {
            collect = e;
            return;
        }

        int mid = (s + e) / 2;

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mid) {
                count += arr[i] - mid;
                if (count > m) {
                    break;
                }
            }
        }

        if (count == m) {
            collect = mid;
            return;
        }

        if (count <= m) binarySearch(arr, s, mid - 1);
        else binarySearch(arr, mid + 1, e);

    }
}
