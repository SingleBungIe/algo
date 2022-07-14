package D1;

import java.util.Scanner;

/*
처음 접근은 1을 먼저 출력하고 2를 곱하는 식으로 접근 했으나
Math API를 통해 Math.pow() 함수를 활용 할 수 있음을 알게되었다.
Math.pow()는 Double형으로 입출력 되기 때문에 형변환을 해주었다.
 */

public class D1_2019_더블더블 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int doubleNum = 1;
//
//        System.out.print(doubleNum + " ");
//        for (int i = 1; i <= num; i++) {
//            doubleNum *= 2;
//            System.out.print(doubleNum + " ");
//        }
        for (int i = 0; i <= num; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}


