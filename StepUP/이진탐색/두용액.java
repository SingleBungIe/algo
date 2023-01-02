package StepUP.이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 두용액 {
    static int firstNum; // 1번 용액
    static int secondNum; // 2번 용액
    static int gap = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < N; i++)
            binarySearch(arr, i);
        System.out.println(firstNum + " " + secondNum);


    }

    static void binarySearch(int arr[], int i) {
        int start = i + 1;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = Math.abs(arr[i] + arr[mid]);
            if (sum < gap) {
                gap = sum;
                firstNum = arr[i];
                secondNum = arr[mid];
            }
            if (arr[i] + arr[mid] < 0) start = mid + 1;
            else end = mid - 1;
        }
    }


}
