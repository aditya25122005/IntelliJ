package practice;
import java.util.*;
public class leetcode_118 {
    public static void main(String[] args) {
        int numRows=5;
        System.out.println(generate(numRows));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            int number=1;
            List<Integer> ll=new ArrayList<>();
            for(int j=0;j<=i;j++){
                ll.add(number);
                number=number*(i-j)/(j+1);


            }
            l1.add(ll);
        }
        return l1;
    }
}
