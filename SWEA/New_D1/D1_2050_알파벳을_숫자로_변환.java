package SWEA.New_D1;

import java.util.Scanner;

public class D1_2050_알파벳을_숫자로_변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i) - 64 + " ");
        }
    }
}
