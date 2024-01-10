package SWEA.New_D2;

import java.util.*;

public class D2_1859_백만_장자_프로젝트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[n - 1];
            long result = 0;

            for (int i = n - 2; i >= 0; i--) {
                if (max < arr[i]) {
                    max = arr[i];
                } else if (max > arr[i]) {
                    result += max - arr[i];
                }
            }


//            ArrayList<Integer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                list.add(sc.nextInt());
//            }
//
//            long max = Collections.max(list);
//            while (!list.isEmpty()) {
//                if (list.get(0) == max) {
//                    list.remove(0);
//                    if (list.isEmpty())
//                        break;
//                    max = Collections.max(list);
//                } else if (list.get(0) < max) {
//                    result += max - list.get(0);
//                    list.remove(0);
//                }
//            }

            System.out.println("#" + t + " " + result);


        }


    }
}
