package java22sept;
import java.util.*;

public class findWordsContainingChar {
    public static void main(String[] args) {
        String [] words = {"leet","code"};
        char x= 'e';
        System.out.println(findWordsContaining(words,x));
    }
    public static  List<Integer> findWordsContaining(String[] words, char x) {
        List <Integer> l1=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                l1.add(i);
            }
        }
        return l1;

    }
}
