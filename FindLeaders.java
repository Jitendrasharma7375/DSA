public class FindLeaders {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int[][] arr1 = new int[4][3];
        System.out.println(arr1.length);
        findArrayLeaders(arr);
    }

    private static void findArrayLeaders(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }

}
