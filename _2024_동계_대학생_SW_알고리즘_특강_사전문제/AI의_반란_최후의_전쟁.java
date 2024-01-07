package _2024_동계_대학생_SW_알고리즘_특강_사전문제;

import java.util.Arrays;
import java.util.Scanner;

public class AI의_반란_최후의_전쟁 {
    static int agentAbilityArr[][];
    static int galaxy[];
    static int agent;
    static boolean isSelected[];
    //    static int agentPermutationSum; // 갤럭시에게 공유하는 요원들의 순열 합
    static int agentAbilitySum;
    static int minAgentAbilitySum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt(); // 테스트케이스 수

        for (int t = 1; t <= testCase; t++) { // 테스트케이스 만큼 반복
//            agentPermutationSum = 0;
            agentAbilitySum = 0;
            minAgentAbilitySum = Integer.MAX_VALUE;
            agent = sc.nextInt(); // 요원 수
            agentAbilityArr = new int[agent][4]; //요원 수 능력치 배열
            galaxy = new int[3];

            // 요원 배열 초기화
            for (int i = 0; i < agent; i++) {
                for (int j = 0; j < 3; j++) {
                    agentAbilityArr[i][j] = sc.nextInt();
                    agentAbilitySum += agentAbilityArr[i][j];
                    agentAbilityArr[i][3] = Math.max(agentAbilityArr[i][j], agentAbilityArr[i][3]);
                }
            }
            isSelected = new boolean[agent];


            if (agent < 3) {
                System.out.print("#" + t + " " + -1);
                System.out.println();
                continue;
            }
            permutation(0);
            System.out.print("#" + t + " " + minAgentAbilitySum);
            System.out.println();
        }

    }

    private static void permutation(int index) {
        if (index == 3) {
            int agentPermutationSum = 0;
            for (int i = 0; i < 3; i++) {
                agentPermutationSum += agentAbilityArr[galaxy[i]][i];
//                System.out.print(agentAbilityArr[galaxy[i]][i] + " ");
            }
            Loop:
            for (int i = 0; i < agent; i++) {
                for (int j = 0; j < galaxy.length; j++) {
                    if (i == galaxy[j]) {
                        continue Loop;
                    }
                }
                agentPermutationSum += agentAbilityArr[i][3];
            }

            minAgentAbilitySum = Math.min(minAgentAbilitySum, agentAbilitySum - agentPermutationSum);
//            System.out.println();
            return;
        }
        for (int i = 0; i < agent; i++) {
            if (isSelected[i] == true)
                continue;
            galaxy[index] = i;
            isSelected[i] = true;
            permutation(index + 1);
            isSelected[i] = false;
        }
    }
}
/*
갤럭시는 모든 능력치를 한번씩 공유받아야 함
요원의 능력치를 순열로 정리
요원 3명의 순열만 구하고 나머지 요원은 제일 큰 능력치만 선택 (순열 시간 감소)
순열의 합이 제일 큰 수를 구하고, 요원의 모든 능력치 합에서 빼면, 능력치 소멸 최소 합

1   1   2
1   2   3
1   3   1

1
    1
        1
1
        1
    1



 */

