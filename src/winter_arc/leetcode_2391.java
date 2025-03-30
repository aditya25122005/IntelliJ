package winter_arc;

public class leetcode_2391 {
    public static void main(String[] args) {
        String[] garbage={"G","P","GP","GG"};
        int [] travel={2,4,3};
        System.out.println(garbageCollection(garbage,travel));
    }
    public static int garbageCollection(String[] garbage, int[] travel) {
        int lastM=-1;
        int lastG=-1;
        int lastP=-1;

        int countG=0;
        int countP=0;
        int countM=0;

        int total=0;

        for(int i=0;i<garbage.length;i++){
            String s=garbage[i];
            for(char ch:s.toCharArray()){
                if(ch=='M'){
                    countM++;
                    lastM=i;
                }
                else if(ch=='P'){
                    countP++;
                    lastP=i;
                }
                else if(ch=='G'){
                    countG++;
                    lastG=i;
                }
            }
        }
        total+=countP+ countG + countM;
        for(int i=0;i<travel.length;i++){
            if(i<lastM) total+= travel[i];
            if(i<lastG) total+= travel[i];
            if(i<lastP) total+= travel[i];
        }
        return total;
    }
}
