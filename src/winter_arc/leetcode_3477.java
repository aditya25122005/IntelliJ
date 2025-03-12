package winter_arc;

public class leetcode_3477 {
    public static void main(String[] args) {
        int [] fruits={4,2,5};
        int [] baskets={3,4,5};
        System.out.println(numOfUnplacedFruits(fruits,baskets));
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int occupied=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    fruits[i]=0;
                }
                if(fruits[i]==0){
                    occupied++;
                    break;
                }
            }
        }
        return fruits.length-occupied;
    }
}
