package arraylist;
import java.util.*;
public class examSwordKing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); // Input
        System.out.println(findKing(n));
    }

    public static int findKing(int n) {
        int result = 0; // Starting index for 1 person (0-based index)
        for (int i = 2; i <= n; i++) {
            result = (result + 2) % i; // Step size is 2 for every iteration
        }
        return result + 1; // Convert to 1-based index
    }


}
