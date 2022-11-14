package StepUP.완전탐색_1;

import java.util.Scanner;

public class class_president {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int studentTable[][] = new int[student][5];
        int studentNum = -1;
        int studentCnt = 0;
        int resultStudent = 0;


        for (int i = 0; i < student; i++) {
            for (int j = 0; j < student; j++) {
                studentTable[i][j] = sc.nextInt();
                // System.out.print(studentTable[i][j] + " ");
            }
            // System.out.println();
        }

        for (int i = 0; i < student; i++) {
            studentCnt = 0;
            for (int j = 0; j < student; j++) {
                for (int a = 0; a < 5; a++) {
                    if (i == j)
                        break;
                    if (studentTable[i][a] == studentTable[j][a]) {
                        studentCnt++;
                    }
                }
                if (studentNum < studentCnt) {
                    studentNum = studentCnt;
                    resultStudent = i + 1;
                }
            }
        }
        System.out.println(resultStudent);
    }
}
