package winter_arc;

public class leetcode_2105 {
    public static void main(String[] args) {
        int [] arr={2,2,3,3};
        int A=5;
        int B=5;
        System.out.println(minimumRefill(arr,A,B));
    }
    public static int minimumRefill(int[] arr, int A, int B) {
        int refill=0;
        int currA=A;
        int currB=B;

        int i=0;
        int j=arr.length-1;


        while(i<=j){
            if(i==j){
                if(currA>=currB){
                    if(arr[i]>currA){
                        refill++;
                    }
                }
                else{
                    if(arr[j]>currB){
                        refill++;
                    }
                }
                break;
            }

            if(arr[i]>currA){
                refill++;
                currA=A;
            }
            if(arr[j]>currB){
                refill++;
                currB=B;
            }
            currA-=arr[i];
            currB-=arr[j];

            i++;
            j--;
        }
        return refill;

    }
}
