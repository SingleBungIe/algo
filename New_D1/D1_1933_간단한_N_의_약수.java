package New_D1;

import java.util.Scanner;

public class D1_1933_간단한_N_의_약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            if (n % i == 0)
                System.out.print(n / i + " ");
        }
    }
}
