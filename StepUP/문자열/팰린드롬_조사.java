package StepUP.문자열;

import java.util.Scanner;

public class 팰린드롬_조사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

//        System.out.println(str.toString());
//        System.out.println(sb.reverse().toString());

         if(str.equals(sb.reverse().toString()))
           System.out.print("YES");
         else
           System.out.print("NO");



    }
}
