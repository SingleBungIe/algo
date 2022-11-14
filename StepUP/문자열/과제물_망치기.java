package StepUP.문자열;

import java.util.Scanner;

public class 과제물_망치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();

        for (int i = 0; i < Line.length(); i++) {
            if (Line.charAt(i) == ' ') {
                continue;
            } else
                System.out.print(Line.charAt(i));
        }
    }
}
