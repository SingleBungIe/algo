package StepUP.조건문_반복문;

import java.util.Scanner;

public class 짝수_판별하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 10 == 0)
            System.out.println("even");
        else
            System.out.println("not even");
    }
}
