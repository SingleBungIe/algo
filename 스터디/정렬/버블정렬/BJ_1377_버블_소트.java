package 스터디.정렬.버블정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1377_버블_소트 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        mData[] A = new mData[N];
        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(reader.readLine()), i);
        }
        Arrays.sort(A); // A 배열 정렬(O(nlogn) 시간 복잡도)
        int Max = 0;
        for (int i = 0; i < N; i++) {
            if (Max < A[i].index - i) // 정렬 전 index - 정렬 후 index 계산의 최댓값 저장하기
                Max = A[i].index - i;
        }
        System.out.println(Max + 1);
    }
}
// 객체로 이루어진 배열이기 때문에 객체 클래스가 Comparable 인터페이스의 compareTo() 메서드를 구현하고 있어야 정렬이 된다.
class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) { // value 기준 오름차순 정렬하기
        return this.value - o.value;
    }
}
