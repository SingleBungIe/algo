package SWEA.New_D1;

import java.util.Scanner;

public class D1_2058_자릿수_더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

//        if (num > 1000) {
//            sum += (num / 1000);
//            num %= 1000;
//        }
//        if (num > 100) {
//            sum += (num / 100);
//            num %= 100;
//        }
//        if (num > 10) {
//            sum += (num / 10);
//            num %= 10;
//        }
//        if (num > 1) {
//            sum += num;
//        }

        while (num >= 1) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println(sum);
    }
}
