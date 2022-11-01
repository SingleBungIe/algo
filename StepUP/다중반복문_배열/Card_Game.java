package StepUP.다중반복문_배열;

import java.util.Scanner;

public class Card_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int A_winnerCnt = 0;
        int B_winnerCnt = 0;
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt(); // A 카드 세팅
        }
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt(); // B 카드 세팅
        }
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i])
                A_winnerCnt++;
            else if (A[i] == B[i])
                continue;
            else B_winnerCnt++;
        }
        if (A_winnerCnt > B_winnerCnt)
            System.out.println("A");
        else if (A_winnerCnt == B_winnerCnt)
            System.out.println("D");
        else
            System.out.println("B");
    }
}
