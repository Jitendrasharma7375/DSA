public class BinaryPalindrome {
    public static void main(String[] args) {
        int binaryNumber=0b11011;
        StringBuilder sb=new StringBuilder(Integer.toBinaryString(binaryNumber));
        String reverse=sb.reverse().toString();
        if(sb.toString().equals(reverse))
        {
            System.out.println("Binary number is palindrome");
        }
        else
        {
            System.out.println("Binary number is not palindrome");
        }
    }
}
