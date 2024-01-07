package _2024_동계_대학생_SW_알고리즘_특강_사전문제;

import java.util.ArrayList;
import java.util.Scanner;

public class pjy_AI의_반란_최후의_전쟁 {
    static int Asum;
    static int minSum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int t = 1; t <= testCase; t++) {
            Asum = 0;
            minSum = Integer.MAX_VALUE;
            int arr[] = new int[3];
            int n = sc.nextInt();
            int arr2[][] = new int[n][4];
            boolean check[] = new boolean[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    arr2[i][j] = sc.nextInt();
                    arr2[i][3] = Math.max(arr2[i][j], arr2[i][3]);
                    Asum += arr2[i][j];
                }
            }

            if (n < 3) {
                System.out.println("#" + t + " " + -1);
                continue;
            }
            ag(0, n, arr, arr2, check);
            System.out.println("#" + t + " " + minSum);
        }

    }

    private static void ag(int idx, int n, int arr[], int arr2[][], boolean check[]) {
        if (idx == 3) {
            int Sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                Sum += arr2[arr[i]][i];
                list.add(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                if (list.contains(i))
                    continue;
                Sum += arr2[i][3];
            }
            minSum = Math.min(minSum, Asum - Sum);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (check[i] == true)
                continue;
            arr[idx] = i;
            check[i] = true;
            ag(idx + 1, n, arr, arr2, check);
            check[i] = false;
        }
    }
}

