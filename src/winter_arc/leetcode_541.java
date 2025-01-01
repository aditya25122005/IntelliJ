package winter_arc;

public class leetcode_541 {
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));
    }
    public static String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            if(i+k-1<n-1){
                reverse(i,i+k-1,arr);
            }
            else{
                reverse(i,n-1,arr);
            }
        }
        String ans=new String(arr);
        return ans;
    }
    public static void reverse(int i,int j,char[] arr){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
}
