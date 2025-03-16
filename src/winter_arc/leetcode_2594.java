package winter_arc;

public class leetcode_2594 {
    public static void main(String[] args) {
        int [] ranks={4,3,2,1};
        int cars=10;
        System.out.println(repairCars(ranks,cars));
    }
    public static long repairCars(int[] ranks, int cars) {
        long lo=1;
        long hi=Integer.MIN_VALUE;
        for(int num:ranks){
            hi=Math.max(hi,num);
        }
        hi= hi*1l*cars*1l*cars;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(isItPossible(ranks,cars,mid)){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
    public static boolean isItPossible(int [] ranks, int cars, long mid){
        long count=0;
        for(int x:ranks){
            count+=(int) Math.sqrt(mid/x);
        }
        return count>=cars;
    }
}
