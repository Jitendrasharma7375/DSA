import java.util.*;

public class Countoccurence {
    public static void main(String[] args) {
        //Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
        //Example 1:
        //Input: arr = [1,2,2,1,1,3]
        //Output: true
        //Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

        //Example 2:
        //Input: arr = [1,2]
        //Output: false
        //Example 3:
        //Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
        //Output: true
        //Constraints:
        //1 <= arr.length <= 1000
        //-1000 <= arr[i] <= 1000
        int arr[]={1,2,2,1,1,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        Set<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(set.contains(entry.getValue()))
            {
                System.out.println("false");
                return;
            }
            set.add(entry.getValue());
        }
    }
}
