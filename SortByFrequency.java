import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
        int size = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<Integer, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //print the array in sorted order of frequency


    }
}
