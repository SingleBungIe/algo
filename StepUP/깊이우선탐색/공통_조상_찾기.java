package StepUP.깊이우선탐색;

import java.util.Scanner;

public class 공통_조상_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //노드 개수 n , 두 노드 x, y;
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();


        int arr[][] = new int[1001][2];

        //노드 입력 완료
        for (int i = 0; i < n - 1; i++) {
            //부모 노드 0, 자식 노드 1;
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int xarr[] = new int [1001];
        int yarr[] = new int [1001];
        int xCount = 0, yCount = 0;

        xarr[xCount] = x;
        yarr[yCount] = y;

        while (true) {
            for (int i = 0; i < n; i++) {
                if (arr[i][1] == xarr[xCount]) {
                    xarr[xCount + 1] = arr[i][0];
                    xCount++;
                    break;
                }
            }
            if (xarr[xCount - 1] == 0) {
                break;
            }
        }

        while (true) {
            for (int i = 0; i < n; i++) {
                if (arr[i][1] == yarr[yCount]) {
                    yarr[yCount + 1] = arr[i][0];
                    yCount++;
                    break;
                }
            }
            if (yarr[yCount - 1] == 0) {
                break;
            }
        }

        int flag = 0;

        for (int i = 0; i < xCount; i++) {
            for (int j = 0; j < yCount; j++) {
                if (xarr[i] == yarr[j]) {
                    System.out.println(xarr[i]);
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                break;
            }
        }


    }
}
