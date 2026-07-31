package Map;
import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        HashMap<Integer, Integer> map =
                new HashMap<>();

        for (int x : arr) {
            map.put(
                    x,
                    map.getOrDefault(x, 0) + 1
            );
        }

        ArrayList<Integer> list =
                new ArrayList<>(map.keySet());

        list.sort(
                (a, b) ->
                        Integer.compare(
                                map.get(b),
                                map.get(a)
                        )
        );

        for (int i = 0;
             i < Math.min(k, list.size());
             i++) {

            System.out.print(
                    list.get(i) + " "
            );
        }
    }
}
