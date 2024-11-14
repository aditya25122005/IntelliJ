package practice;

import java.util.*;
public class isAnagram {
    public static void main (String args[])
    {

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine().trim();
        String s2= sc.nextLine().trim();
        if(s1.length()!=s2.length()){
            System.out.println("False");
        }
        else{



            char [] arr1=s1.toCharArray();
            char [] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    System.out.println("False");
                    return;
                }
            }
            System.out.println("True");
        }

    }
}