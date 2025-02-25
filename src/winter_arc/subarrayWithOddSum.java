package winter_arc;

public class subarrayWithOddSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr));
    }
    public static int numOfSubarrays(int[] arr) {
        long oddcount=0;
        long evencount=1;
        long PS = 0;
        long result= 0;
        for(int val:arr){
            PS+=val;
            if(PS%2==0){
                result+=oddcount;
                evencount++;
            }
            else{
                result+=evencount;
                oddcount++;
            }

        }
        return (int) (result % 1000000007 );







    }
}
