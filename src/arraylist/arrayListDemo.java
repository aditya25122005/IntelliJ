package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class arrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>(99);
        l1.add(10);    //O(1)
        l1.add(20);
        l1.add(30);
        System.out.println(l1);
        l1.add(1,9);  //O(N)
        System.out.println(l1);
        l1.addLast(50);
        System.out.println(l1);

        System.out.println(l1.get(2));
        l1.remove(2);
        System.out.println(l1);
        System.out.println(l1.size());
        l1.set(1,101);
        System.out.println(l1);
//        for(int i=0;i<l1.size();i++){
//            System.out.print(l1.get(i)+" ");
//        }
        for(int ele:l1){
            System.out.print(ele+" ");
        }
        System.out.println();
        Collections.sort(l1);
        System.out.println(l1);

        int num=2315;
        String s=String.valueOf(num);
        char [] arr=s.toCharArray();
        Arrays.sort(arr);
        for(char ch:arr){
            System.out.println(ch);
        }
    }
}
