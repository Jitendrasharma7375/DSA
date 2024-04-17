import java.util.Scanner;

public class CharArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();

        char arr[]=new char[20];
        arr=str.toCharArray();
        System.out.println(arr);

        reverseArray(arr);

        System.err.println(arr);
        sc.close();
    }

    public static void reverseArray(char arr[])
    {
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
