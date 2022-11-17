package StepUP.이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자_개수_세기 {
    static int n,m;
    static int data[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        Arrays.sort(data);

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int front, rear;
            front = getStartPoint(num);
            rear = getEndPoint(num);
            if (front == -1) System.out.println("0");
            else System.out.println(rear - front + 1);
        }

    }

    private static int getStartPoint(int value) {
        int start, end;
        if (data[0] < value) start = 0;
        else {
            if (data[0] > value) return -1;
            else return 0;
        }
        if (data[n - 1] >= value) end = n - 1;
        else return -1;
        while (start + 1 < end) {
            int mid = (start + end) / 2;
            if (data[mid] < value) start = mid;
            else end = mid;
        }
        if (data[end] == value) return end;
        else return -1;
    }

    private static int getEndPoint(int value) {
        int start, end;

        if (data[0] <= value) start = 0;
        else return -1;

        if (data[n - 1] > value) end = n - 1;
        else {
            if (data[n - 1] < value) return -1;
            else return n - 1;
        }
        while (start + 1 < end) {
            int mid = (start + end) / 2;

            if (data[mid] <= value) start = mid;
            else end = mid;
        }
        if (data[start] == value) return start;
        else return -1;
    }
}
