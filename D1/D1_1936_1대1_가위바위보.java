package D1;

import java.util.Scanner;

public class D1_1936_1대1_가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A == 1 & B == 2) {
            System.out.println("B");
        } else if (A == 1 & B == 3) {
            System.out.println("A");
        } else if (A == 2 & B == 1) {
            System.out.println("A");
        } else if (A == 2 & B == 3) {
            System.out.println("B");
        } else if (A == 3 & B == 1) {
            System.out.println("B");
        } else if (A == 3 & B == 2) {
            System.out.println("A");
        }

    }
}
