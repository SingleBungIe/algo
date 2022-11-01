package StepUP.다중반복문_배열;

import java.util.Arrays;
import java.util.Scanner;

public class 주사위_게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int person[] = new int[N];

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int winnerCost;
            if (a == b && a == c && b == c) {
                winnerCost = 10000 + (a * 1000);
            } else if (a != b && a == c && b != c) {
                winnerCost = 1000 + (a * 100);
            } else if (a == b && a != c && b != c) {
                winnerCost = 1000 + (a * 100);
            } else if (a != b && a != c && b == c) {
                winnerCost = 1000 + (b * 100);
            } else {
                winnerCost = Math.max(a, b);
                winnerCost = Math.max(winnerCost, c);
            }
            person[i] = winnerCost;
        }
        Arrays.sort(person);
        System.out.println(person[person.length - 1]);
    }
}

