package StepUP.자료구조;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 원형큐_구현하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int order = sc.nextInt();
            if (order == 1) {
                int offerNum = sc.nextInt();
                if (queue.size() == n) {
                    System.out.println("Overflow");
                    continue;
                } else
                    queue.offer(offerNum);
            } else if (order == 2) {
                if (queue.size() == 0) {
                    System.out.println("Underflow");
                    continue;
                } else
                    queue.poll();
            } else if (order == 3) {
                if (queue.size() == 0) {
                    System.out.println("NULL");
                } else
                    System.out.println(queue.peek());
            }
        }

    }
}
