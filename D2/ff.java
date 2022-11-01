package D2;

public class ff {
    public static void main(String[] args) {
        String s = "abcd";
        String[] array_word;
        array_word = s.split("");

        int arr[] = new int[2];
        int cnt = 0;

        for (int i = 0; s.length() > i; i++) {
            // 문자 찾기
            if (array_word[i].equals("a")) {
                arr[0] = i + 1; // 1을 더해줘서 대입
                // 가득 차 있으면 카운터 증가
                if (arr[0] >= 1 && arr[1] >= 1) {
                    cnt++;
                    arr[0] = 0;
                    arr[1] = 0;
                }
                arr[0] = i + 1; // 1을 더해줘서 대입
            } else if (array_word[i].equals("z")) {
                arr[1] = i + 1;
                if (arr[0] >= 1 && arr[1] >= 1) {
                    cnt++;
                    arr[0] = 0;
                    arr[1] = 0;
                }
                arr[1] = i + 1;
            }
        }
        System.out.println(cnt);
    }
}

