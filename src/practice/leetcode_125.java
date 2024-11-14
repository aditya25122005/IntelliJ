package practice;

public class leetcode_125 {
    public static void main(String[] args) {
        String s="Anana";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1){
            return true;
        }
        char [] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char c=arr[i];
            char cp=arr[j];

            //
            if(c>=65 && c<=90){
                c+=32;
            }
            if(cp>=65 && cp<=90){
                cp+=32;
            }
            if(c<48 || (c>57 && c<97) || c>122){
                i++;
                continue;

            }
            if(cp<48 || (cp>57 && cp<97) || cp>122){
                j--;
                continue;
            }
            if(cp!=c){
                return false;
            }
            else{
                i++;
                j--;
            }
        }

        return true;
    }
}
