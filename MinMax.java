public class MinMax {
    public static void main(String[] args) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int arr[]={11,22,33,44,55};
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
