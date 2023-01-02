package StepUP.너비_우선_탐색;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 이상한_계산기 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int n;
    private static int[] level;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        level = new int[1000000];

        bfs(1);

        bw.write(level[n] - 1 + "");
        br.close();
        bw.flush();
        bw.close();
    }

    private static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        level[v] = v;

        while(!queue.isEmpty()) {
            int w = queue.poll();

            int mul = w * 2;
            int div = w / 3;

            if(mul > 0 && mul <= 99999) {
                if(level[mul] == 0) {
                    queue.add(mul);
                    level[mul] = level[w] + 1;
                }
                if(mul == n) break;
            }

            if(div > 0 && div <= 99999) {
                if(level[div] == 0) {
                    queue.add(div);
                    level[div] = level[w] + 1;
                }
                if(div == n) break;
            }
        }

    }

}
