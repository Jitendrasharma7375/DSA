import java.util.HashMap;
import java.util.Map;

public class SortAccordingFrequency {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };
        int freqArr[] = new int[arr.length];
        int size = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < size; i++) {
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            //     map.put(arr[i], 1);
            // }
            //map.put(arr[i],getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
        for (int i = 0; i < size; i++) {
            freqArr[i] = map.get(arr[i]);
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(freqArr[i]);
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (freqArr[i] < freqArr[j]) {
                    int temp = freqArr[i];
                    freqArr[i] = freqArr[j];
                    freqArr[j] = temp;
                    int temp1 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp1;
                } else if (freqArr[i] == freqArr[j]) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
