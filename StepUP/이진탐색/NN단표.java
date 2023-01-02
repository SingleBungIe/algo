package StepUP.이진탐색;

import java.util.Scanner;

public class NN단표 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();

        // 값
        long start = 1;
        long end = N * N + 1;
        while (start + 1 < end) {
            long mid = (start + end) / 2;
            long myOrder = getOrder(mid, N);
//            if (myOrder == K) {
//                System.out.println(mid);
//                return;
//            } else
            if (myOrder <= K) {
                start = mid;
            } else {
                end = mid;
            }
        }
        System.out.println(start);
    }

    private static long getOrder(long mid, long n) {

        long result = 0; // 순서

        for (int i = 1; i <= n; i++) {
            if (i * n < mid)
                result += n;
            else {
                if (mid % i == 0) {
                    result += (mid / i) - 1;
                } else
                    result += (mid / i);
            }


        }

        return result + 1;


    }
}
//1 2 3 4
//2 4 6 8
//3 6 9 12
//4 8 12 16

//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//1 2 2 3 3 4 4 4 5  6 6  8  8  9  12 12 16