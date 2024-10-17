package java_16_oct;

public class leetcode_gas_station_134 {
    public static void main(String[] args) {
       int[] gas = {1,2,3,4,5},  cost = {3,4,5,1,2};

        System.out.println(cancomplete(gas,cost));
    }
    public static int cancomplete(int[] gas,int[] cost){
        int total=0;
        for(int i=0;i<cost.length;i++){
            total+=gas[i]-cost[i];
        }
        if(total<0){
            return -1;
        }
        int idx=0;
        int c=0;
        for(int i=0;i<cost.length;i++){
            c+=gas[i]-cost[i];
            if(c<0){
                idx+=1;
                c=0;
            }

        }
        return idx;
    }
}
