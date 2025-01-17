package winter_arc;

public class leetcode_165 {
    public static void main(String[] args) {
    String version1="1.2";
        String version2="1.10";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
        String [] arr1=version1.split("\\.");
        String [] arr2=version2.split("\\.");
        int n=arr1.length;
        int m=arr2.length;

        for(int i=0;i<Math.max(n,m);i++){
            int num1=(i<n)? Integer.parseInt(arr1[i]):0;
            int num2=(i<m)? Integer.parseInt(arr2[i]):0;
            if(num1>num2){
                return 1;
            }
            if(num1<num2){
                return -1;
            }

        }
        return 0;

    }
}
