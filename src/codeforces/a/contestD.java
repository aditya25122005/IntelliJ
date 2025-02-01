package codeforces.a;

import java.util.Scanner;

public class contestD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();  // Length of the array
            int[] arr = new int[n];  // Array to store the elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  // Read each element
            }
            System.out.println(canMakeIncreasing(arr, n) ? "YES" : "NO");
        }
    }

    public static boolean canMakeIncreasing(int[] arr, int n) {
        // We need to track the minimum value that we can subtract from elements
        long minPossible = arr[0];  // Start with the first element

        for (int i = 1; i < n; i++) {
            if (arr[i] < minPossible) {
                // If the current element is less than the minimum possible value we can subtract, it's impossible
                return false;
            }

            // Update minPossible to the minimum of the current element
            minPossible = Math.min(minPossible, arr[i]);
        }
        return true;  // If we traverse the whole array and don't find any issues, return true
    }
}
