package StepUP.자료구조;

import java.util.Scanner;
import java.util.Stack;

public class New_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<Character>();
        String A = sc.nextLine();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                st.push('(');
            } else if (A.charAt(i) == ')') {
                if (st.isEmpty()) {
                    System.out.println("NO");
                    return;
                } else
                    st.pop();
            }
        }
        if (st.isEmpty()) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
