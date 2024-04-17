public class CountGivenWordOccurence {
    public static void main(String[] args) {
        String s = "Tim TomTimTom Tim Tom";
        String word = "Tom";
        String a[] = s.split(" ");
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        System.out.println(sb.indexOf(word));
        while(sb.indexOf(word)!=-1)
        {
            int index=sb.indexOf(word);
            count++;
            sb.delete(index,index+word.length());
        }
        System.out.println(count);
        int count1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(word)) {
                count1++;
            }
        }
        int count2=0;
        for(String i:a)
        {
            if(i.equals(word))
            {
                count2++;
            }
        }
        //System.out.println(s.contentEquals(sb));
        System.out.println(count2);
        System.out.println(count1);
    }
}