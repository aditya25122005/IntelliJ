package winter_arc;

public class leetcode_917 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    public static String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char [] arr=s.toCharArray();
        while(i<j){
            if(isChar(arr[i]) && isChar(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;
            }
            else if(!(isChar(arr[i]))) i++;
            else if(!(isChar(arr[j]))) j--;
        }
        return String.valueOf(arr);
    }
    public static boolean isChar(char ch){
        int val=(int)ch;
        if((val>=65 && val<=90) || (val>=97 && val<=122)){
            return true;
        }
        return false;
    }
}
