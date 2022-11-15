package StepUP.문자열;

import java.util.Scanner;

public class 문자열_포함관계_조사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        if (A.contains(B)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}

