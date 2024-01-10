package New_D1;

import java.util.Scanner;

public class D1_1936_1대1_가위바위보 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("A");
        else
            System.out.println("B");
    }
}
