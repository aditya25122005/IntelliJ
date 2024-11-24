package practice;
public class leetcode_1299 {
    public static void main(String[] args) {
        int [] arr={17,18,5,4,6,1};
        System.out.println(replaceElements(arr));


    }
    public static  int[] replaceElements(int[] arr) {
        int maxTillNow=-1;
        for(int i=arr.length-1;i>=0;i--){
            int current=arr[i];
            arr[i]=maxTillNow;
            maxTillNow=Math.max(current,arr[i]);


        }
        return arr;
    }
}
