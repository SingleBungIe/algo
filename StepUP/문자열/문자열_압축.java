package StepUP.문자열;

import java.util.Scanner;

public class 문자열_압축 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String resultStr = "";
        int cnt = 1;

        // char alphabet[] = new int[26];
        // int alphabetNum[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                if(cnt != 1)
                    resultStr += cnt;
                resultStr += str.charAt(i);
                cnt = 1;
            }
        }
        System.out.println(resultStr);

    }

}
