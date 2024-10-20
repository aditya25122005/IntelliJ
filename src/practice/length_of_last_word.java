package practice;
import java.util.*;
public class length_of_last_word {
    public static void main(String[] args) {
        String s="luffy is still joyboy";
        String [] arr=s.split(" ");
        System.out.println(arr[arr.length-1].length());

    }
}
