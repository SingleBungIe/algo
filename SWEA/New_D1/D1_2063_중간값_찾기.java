package SWEA.New_D1;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2063_중간값_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        System.out.println(a[a.length/2]);
    }
}
