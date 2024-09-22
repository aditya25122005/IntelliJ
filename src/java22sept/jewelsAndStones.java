package java22sept;
import java.util.*;

public class jewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));

    }
    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> jewelSet=new HashSet<>();
        for(char jewel: jewels.toCharArray()){
            jewelSet.add(jewel);
        }
        int count=0;
        for(char stone:stones.toCharArray()){
            if(jewelSet.contains(stone)){
                count++;
            }
        }

        return count;

    }
}
