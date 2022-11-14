package StepUP.문자열;

import java.util.Scanner;

public class 대소문자_변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            if (Character.isUpperCase(line.charAt(i))) {
                System.out.print(Character.toLowerCase(line.charAt(i)));
            } else if (Character.isLowerCase(line.charAt(i))) {
                System.out.print(Character.toUpperCase(line.charAt(i)));
            } else
                System.out.print(line.charAt(i));
        }

    }
}
