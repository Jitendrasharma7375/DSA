import java.util.*;

public class CharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=0;
        System.out.println("Enter a string: ");
        String str=sc.nextLine();

        char arr[]=new char[20];
        arr=str.toCharArray();
        System.out.println(arr);

        for(int i=0;arr[i]!='\0';i++)
        {
                length++; 
        }
        System.out.println(length);
    }
}