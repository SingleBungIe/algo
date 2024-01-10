package New_D1;

import java.util.Scanner;

public class D1_2043_서랍의_비밀번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 1;

        for (int i = K; i < P; i++) {
            cnt++;
        }
        System.out.println(cnt);


    }
}
