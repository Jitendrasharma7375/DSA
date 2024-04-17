public class LongestSequence {
    public static void main(String[] args) {
        int binaryNumber = 0b11011101111;
        System.out.println(LongestSequence.longestSequence(binaryNumber));
    }

    private static int longestSequence(int binaryNumber) {
        String binaryString = Integer.toBinaryString(binaryNumber);
        int count=0;
        int maxCount=0;
        for(char c:binaryString.toCharArray())
        {
            if(c=='1')
            {
                count++;
                if(count>maxCount)
                {
                    maxCount=count;
                }
            }
            else 
            {
                count=0;
            }
        }
        return maxCount;
    }
}
