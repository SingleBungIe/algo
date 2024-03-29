package SWEA.D2;

import java.util.Scanner;

public class D2_1961_숫자_배열_회전 {
    public static int[][] Rotation(int arr[][]) {
        int result[][] = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[arr.length - j - 1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();

            int arr[][] = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int rotate_90[][] = Rotation(arr);
            int rotate_180[][] = Rotation(rotate_90);
            int rotate_270[][] = Rotation(rotate_180);

            System.out.printf("#%d\n", test_case);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(rotate_90[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(rotate_180[i][j]);
                }
                System.out.print(" ");

                for (int j = 0; j < N; j++) {
                    System.out.print(rotate_270[i][j]);
                }
                System.out.println();

            }

        }
    }
}

