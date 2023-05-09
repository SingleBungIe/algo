package StepUP.깊이우선탐색;
import java.util.*;
public class 이번 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1}; //순열을 만들 배열
        int n = arr.length; //배열의 길이
        int[] output = new int[n]; //순열 출력을 위한 배열
        boolean[] visited = new boolean[n]; //중복해서 뽑지 않기 위해 방문했는지를 체크하는 배열

        //2. DFS를 이용해 구현
        per2(arr, output, visited, 0 ,n, 2); //r = 3, 3개를 뽑을 것

    }

    static void per2(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
//            System.out.println(output); //순열 출력을 위한 print 함수
//            System.out.println(r);
            return;
        }

        for (int i = 0; i < n; i++) {
//            if (visited[i] != true) {
//                visited[i] = true;
                output[depth] = arr[i];
                per2(arr, output, visited, depth + 1, n, r);
//                visited[i] = false;
//            }
        }
    }

//    public static void main(String[] args) {
//        int[] t = new int[];
//        int[] arr = {2, 2, 1};
//        int n = arr.length;
//        int r = 2;
//
//        //중복순열 (순서있게 배열 + 자기 자신도 포함)
//        System.out.println("\n중복순열");
//        LinkedList<Integer> rePerArr = new LinkedList<>();
//        rePermutation(n, r, rePerArr, arr);
//    }
//
//    //중복순열 (순서있게 배열 + 자기 자신도 포함)
//    private static void rePermutation(int n, int r, LinkedList<Integer> rePerArr, int[] arr) {
//        if (rePerArr.size() == r) {
//            for (int i : rePerArr) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = 0; i < n; i++) {
//            rePerArr.add(arr[i]);
//            rePermutation(n, r, rePerArr, arr);
//            rePerArr.removeLast();
//        }
//    }
}
