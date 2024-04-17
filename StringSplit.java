public class StringSplit {
    public static void main(String[] args) {
        String s="Jitendra [] {} Sharma, Student of rajasthan, university";
        String regex="[\\[{,]";
        String[] arr=s.split(regex);
        for(String str:arr){
            System.out.println(str);
        }
    }
}
