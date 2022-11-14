package StepUP.다중반복문_배열;

import java.util.Scanner;

public class 점수_계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sol[] = new int[N];
        int num[] = new int[N];
        int totalNum = 0;

        for (int i = 0; i < N; i++) {
            sol[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (sol[i] == 1 && i == 0){
                num[i] += 1;
            } else if (sol[i] == 1){
                num[i] = num[i-1] + 1;
            } else if (sol[i] == 0)
                num[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            totalNum += num[i];
        }
        System.out.println(totalNum);
    }
}
