package StepUP.자료구조_트리;
import java.io.*;
import java.util.StringTokenizer;

public class 공통_조상_찾기 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[] parent = new int[n];
        boolean[] isVisited = new boolean[n];

        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            parent[b] = a; // a가 b의 부모
        }

        // x의 조상
        while(true) {
            isVisited[x] = true;
            if(x == 0) break;
            x = parent[x];
        }

        // y의 조상
        while(true) {
            if(isVisited[y]) { // 가장 가까운 공통된 조상 (제일 처음 만난 공통 조상)
                bw.write(y + "");
                break;
            } else {
                isVisited[y] = true;
                y = parent[y];
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

}
