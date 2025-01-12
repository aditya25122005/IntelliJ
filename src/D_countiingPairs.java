import java.util.*;
public class D_countiingPairs{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[n];
            int totalsum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                totalsum += arr[i]; // Compute total sum
            }
            int count = 0;

            Arrays.sort(arr);
            for (int i = 0; i < n - 1; i++) {
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    long remainingSum = totalsum - arr[left] - arr[i] - arr[right];
                    if (remainingSum >= x && remainingSum <= y) {
                        count++;
                        left++;
                        right--;
                    } else if (remainingSum < x) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            System.out.println(count);
        }
    }
}