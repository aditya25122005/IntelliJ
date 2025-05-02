package winter_arc;

public class leetcode_838 {
    public static void main(String[] args) {
        String dominoes="LL..RRRR";
        System.out.println(pushDominoes(dominoes));
    }
    public static String pushDominoes(String dominoes) {
        String s="L"+dominoes+"R";
        char [] arr= s.toCharArray();
        int n=dominoes.length();
        int prev=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]=='.') continue;
            if(arr[prev]==arr[i]){
                for(int k=prev+1;k<i;k++){
                    arr[k]=arr[i];
                }
            }
            else if(arr[prev]=='R' && arr[i]=='L'){
                int l=prev+1;
                int r=i-1;
                while(l<r){
                    arr[l++]='R';
                    arr[r--]='L';
                }
            }
            prev=i;

        }
        return String.valueOf(arr,1,n);
    }
}
