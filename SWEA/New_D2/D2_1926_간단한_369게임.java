package SWEA.New_D2;

import java.util.Scanner;

public class D2_1926_간단한_369게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            String st = String.valueOf(i);
            if (st.contains("3") || st.contains("6") || st.contains("9")) {
                st = st.replaceAll("[3,6,9]", "-").replaceAll("\\d","");
                System.out.print(st + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
