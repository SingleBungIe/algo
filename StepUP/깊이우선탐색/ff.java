package StepUP.깊이우선탐색;



import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class ff {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
//        arr.add(3);
//        arr.add(5);
//        arr.add(2);
//        arr.add(1);
//        arr.add(9);
//        arr.add(6);

        while (arr.size() >= 1 && arr.size() != 1) {
            double max = Collections.max(arr);
            double min = Collections.min(arr);

            arr.remove(Collections.max(arr));
            arr.remove(Collections.min(arr));

            double cost = Math.ceil((min + max) / (max - min + 1));
            arr.add((int)cost);
        }

    }
}
