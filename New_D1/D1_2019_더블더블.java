package New_D1;

import java.util.Scanner;

public class D1_2019_더블더블 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 1;
        System.out.print(result + " ");
        for (int i = 1; i <= n; i++) {
            result *= 2;
            System.out.print(result + " ");
        }
    }
}
