package StepUP.자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 스택_구현하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        int size = sc.nextInt();
        int orderNum = sc.nextInt();

        for (int i = 0; i < orderNum; i++) {
            int order = sc.nextInt();
            if (order == 1) {
                int num = sc.nextInt();
                if (st.size() == size) {
                    System.out.println("Overflow");
                    continue;
                }
                st.push(num);

            } else if (order == 2) {
                if (st.size() == 0) {
                    System.out.println("Underflow");
                    continue;
                }
                st.pop();
            } else if (order == 3) {
                if (st.size() == 0)
                    System.out.println("NULL");
                else
                    System.out.println(st.peek());
            }
        }


    }
}
