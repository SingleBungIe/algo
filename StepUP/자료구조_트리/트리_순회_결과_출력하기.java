package StepUP.자료구조_트리;

import java.io.*;
import java.util.StringTokenizer;

public class 트리_순회_결과_출력하기 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static int[][] tree;

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());

        tree = new int[n][2];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            tree[a][0] = b;
            tree[a][1] = c;
        }

        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);

        br.close();
    }

    private static void preOrder(int root) { // 전위 (root, left, right)
        if(tree[root][0] == -1 && tree[root][1] == -1) System.out.print(root + " ");
        else {
            System.out.print(root + " ");
            if(tree[root][0] != -1) preOrder(tree[root][0]);
            if(tree[root][1] != -1) preOrder(tree[root][1]);
        }
    }

    private static void inOrder(int root) { // 중위 (left, root, right)
        if(tree[root][0] == -1 && tree[root][1] == -1) System.out.print(root + " ");
        else {
            if(tree[root][0] != -1) inOrder(tree[root][0]);
            System.out.print(root + " ");
            if(tree[root][1] != -1) inOrder(tree[root][1]);
        }
    }

    private static void postOrder(int root) { // 후위 (left, right, root)
        if(tree[root][0] == -1 && tree[root][1] == -1) System.out.print(root + " ");
        else {
            if(tree[root][0] != -1) postOrder(tree[root][0]);
            if(tree[root][1] != -1) postOrder(tree[root][1]);
            System.out.print(root + " ");
        }
    }

}
