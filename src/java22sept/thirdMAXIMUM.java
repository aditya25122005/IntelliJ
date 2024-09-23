package java22sept;
import java.util.*;
public class thirdMAXIMUM {
    public static void main(String[] args) {
        int [] arr={2,2,3,1};
        System.out.println(thirdM(arr));

    }
    public static int thirdM(int[] arr) {
        long max1=Long.MIN_VALUE;
        long max2=Long.MIN_VALUE;
        long max3=Long.MIN_VALUE;
        for(int num: arr){
            if(num>max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(num>max2 && num<max1){
                max3=max2;
                max2=num;

            }
            else if(num>max3 && num<max2){
                max3=num;
            }
        }
        return max3 != Long.MIN_VALUE? (int)max3 : (int)max1;


    }
}

