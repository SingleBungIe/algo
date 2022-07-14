package D1;

import java.util.Scanner;

public class D1_2046_스탬프_찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; num >= i; i++) {
            System.out.print("#");
        }
    }
}
