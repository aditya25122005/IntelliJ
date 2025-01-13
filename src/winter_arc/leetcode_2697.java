package winter_arc;

public class leetcode_2697 {
    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("Aditya"));
    }
    public static String makeSmallestPalindrome(String s) {
        int n=s.length();
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            if((int)arr[i]>(int)arr[n-i-1]){
                arr[i]=arr[n-i-1];
            }
            else if((int)arr[i]<(int)arr[n-i-1]){
                arr[n-i-1]=arr[i];
            }
        }
        return String.valueOf(arr);
    }
}
