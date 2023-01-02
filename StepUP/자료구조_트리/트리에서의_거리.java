package StepUP.자료구조_트리;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 트리에서의_거리 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int n;
    private static int x;
    private static int y;

    private static int[] parent;
    private static int[] visitedX;
    private static int[] visitedY;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        parent = new int[n];
        visitedX = new int[n];
        visitedY = new int[n];

        Arrays.fill(visitedX, -1);
        Arrays.fill(visitedY, -1);
        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            parent[b] = a; // a 노드가 b 노드의 부모 노드
        }

        int count = 0;
        while(true) {
            visitedX[x] = count++;
            if(x == 0) break;
            x = parent[x];
        }

        count = 0;
        int sum = 0;
        while(true) {
            if(visitedX[y] != -1) {
                sum = visitedX[y] + count;
                break;
            } else {
                visitedY[y] = count++;
                if(y == 0) break;
                y = parent[y];
            }
        }

        bw.write(sum + "");
        br.close();
        bw.flush();
        bw.close();
    }

}