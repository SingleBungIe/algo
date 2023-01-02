package StepUP.너비_우선_탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class New_이상한_계산기 {
    static int N;
    static int Level;
    static int visited[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Level = 0;
        visited = new int[1000000];

        if (N == 1)
            System.out.println(0);
        else {
            BFS();
            System.out.println(visited[N] - 1);
        }
    }

    private static void BFS() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = Level++;


        while (!queue.isEmpty()) {
            int current = queue.poll();
            int Mul = current * 2;
            int Div = current / 3;
//            if (Mul == N && Div == N) {
//                break;
//            }
            if (Mul >= 1 && Mul <= 99999 && visited[Mul] == 0){
                visited[Mul] = visited[current] + 1;
                queue.offer(Mul);
                if (Mul == N)
                    break;
            }

            if (Div >= 1 && Div <= 99999 && visited[Div] == 0) {
                visited[Div] = visited[current] + 1;
                queue.offer(Div);
                if (Div == N)
                    break;
            }

        }
    }

}
