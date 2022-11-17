package StepUP.이진탐색;

import java.util.Scanner;

public class 이진탐색 {
    static int n, q;
    static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int value = sc.nextInt();
            if (binaySearch(0, n - 1, value))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    private static boolean binaySearch(int s, int e, int value) {
        if (s > e) return false;
        if (s == e) {
            if (arr[s] == value) return true;
            else return false;
        } else {
            int mid = (s + e) / 2;
            if (arr[mid] < value) return binaySearch(mid + 1, e, value);
            else if (arr[mid] > value) return binaySearch(s, mid - 1, value);
            else return true;
        }
    }
}
