package Do_it.자료구조;
import java.util.*;

public class BJ_숫자의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        int num = 0;
        for (int i = 0; i < sNum.length(); i++) {
            num += Integer.valueOf(sNum.charAt(i)) - '0';
        }
        System.out.println(num);
    }
}
