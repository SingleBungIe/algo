package SWEA.D1;

/*
처음 출력문으로 해결하는 문제인가 생각 했지만
출제 의도는 반복문을 활용하는 것이 아니었나 생각된다.
 */

public class D1_2027_대각선_출력하기 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j)
                    System.out.print("#");
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}
