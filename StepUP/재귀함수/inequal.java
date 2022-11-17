package StepUP.재귀함수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class inequal {
    static int n;
    static char symbol[] = new char[10];
    static boolean check[] = new boolean[10];
    static ArrayList result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            symbol[i] = sc.next().toCharArray()[0];
        }

        result(0, "");
        Collections.sort(result);

        System.out.println(result.get(result.size() - 1));
        System.out.println(result.get(0));
    }

    private static void result(int index, String num) {
        if (index == n + 1) {
            result.add(num);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if (check[i])
                continue;
            if (index == 0 || compare(num.charAt(index - 1), (char) (i + '0'), symbol[index - 1])) {
                check[i] = true;
                result(index + 1, num + Integer.toString(i));
                check[i] = false;
            }
        }
    }

    private static boolean compare(char a, char b, char c) {
        if (c == '<') {
            if (a > b) {
                return false;
            }
        }
        if (c == '>') {
            if (a < b) {
                return false;
            }
        }
        return true;
    }
}
