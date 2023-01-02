package StepUP.이진탐색;

// 찾는 수가 여러개 있을 수 있기 때문에 start 지점과 end 지점을 이진탐색을 통해 따로 찾아 세는 방법

import java.util.Arrays;
import java.util.Scanner;

public class New_숫자_개수_세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < q; i++) {
            int key = sc.nextInt();

            int startPoint = startBinarySearch(arr, key);
            int endPoint = endBinarySearch(arr, key);

            if (startPoint == -1) System.out.println(0);
            else System.out.println(endPoint - startPoint + 1);

        }
    }

    private static int startBinarySearch(int arr[], int key) {
        // start = 항상 key 보다 작은 값
        // end = 항상 key 보다 크거나 같은 값
        // start와 end가 유효값인지 체크하여 실행시간을 줄임

        int start, end;
        if (arr[0] < key) start = 0;
        else if (arr[0] > key) return -1;
        else return 0;

        if (arr[arr.length - 1] < key) return -1;
        else end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                end = mid;
                if (start == end)
                    return mid;
            } else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }

    private static int endBinarySearch(int arr[], int key) {
        int start, end;

        if (arr[0] <= key) start = 0;
        else return -1;

        if (arr[arr.length - 1] > key) end = arr.length - 1;
        else if (arr[arr.length - 1] == key) return arr.length - 1;
        else return -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                start = mid;
                if (start == end)
                    return mid;
            } else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }
}

//1 2 3 4 5 6 7 8 9 10
//1 1 2 2 3 3 3 4 5 10

