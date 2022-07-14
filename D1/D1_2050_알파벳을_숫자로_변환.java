package D1;

import java.util.Scanner;

public class D1_2050_알파벳을_숫자로_변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Alphabet = sc.next();
        int result = 0;
        for (int i = 0; Alphabet.length() > i; i++) {
            result = Alphabet.charAt(i) - 'A' + 1;
            System.out.print(result + " ");
        }
    }
}
