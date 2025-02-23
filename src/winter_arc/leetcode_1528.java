package winter_arc;

public class leetcode_1528 {
    public static void main(String[] args) {
        String s="codeleet";
        int [] indices={4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {

        char [] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
