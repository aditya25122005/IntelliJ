package practice;
import java.util.*;
public class java_1916 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String s="Hello how are you Contestant";
        int k=4;
       String[] arr =s.split(" ");
       for(int i=0;i<k-1;i++){
           sb.append(arr[i]);
           sb.append(" ");
       }
       sb.append(arr[k-1]);
        System.out.println(sb);


    }
}
