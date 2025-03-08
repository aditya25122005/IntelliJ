package winter_arc;

public class leetcode_3216 {
    public static void main(String[] args) {
        String s="45320";
        System.out.println(getSmallestString(s));

    }
    public static String getSmallestString(String s) {
        char [] arr=s.toCharArray();
        for(int i=1;i<s.length();i++){
            int a=s.charAt(i-1)-'0';
            int b=s.charAt(i)-'0';
            if(b<a && a%2==b%2){
                char temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                break;
            }
        }
        return String.valueOf(arr);
    }
}
