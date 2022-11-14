package StepUP.문자열;
/*
    StringBuffer 클래스를 이용하여 reverse() 메소드 사용
 */

import java.util.Scanner;

public class 문자열_뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();

        StringBuffer sb = new StringBuffer(Line);
        String reverseLine = sb.reverse().toString();

        System.out.println(reverseLine);


    }
}
