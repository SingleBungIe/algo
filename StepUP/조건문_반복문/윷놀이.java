package StepUP.조건문_반복문;

/*
배와 등의 합을 구해 값을 비교하여 윷을 판별하였다.
 */

import java.util.Scanner;

public class 윷놀이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int yootSum = 0; // 배와 등의 합을 담는 변수
            for (int j = 0; j < 4; j++) {
                int yoot = sc.nextInt();
                yootSum += yoot; // 입력받은 배와 등을 더함
            }

            // 합을 비교해 윷을 판별
            if (yootSum == 3)
                System.out.println("A");
            else if (yootSum == 2)
                System.out.println("B");
            else if (yootSum == 1)
                System.out.println("C");
            else if (yootSum == 0)
                System.out.println("D");
            else if (yootSum == 4)
                System.out.println("E");
        }
    }
}
