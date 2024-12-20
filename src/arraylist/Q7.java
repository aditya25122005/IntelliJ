package arraylist;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();
            int x4 = scanner.nextInt();
            int y4 = scanner.nextInt();
            int result = isPointInTriangle(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println(result);
        }
        scanner.close();
    }
   
    public static double calculateArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    // Function to check if point P lies inside or on the triangle
    public static int isPointInTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Calculate the area of triangle ABC
        double totalArea = calculateArea(x1, y1, x2, y2, x3, y3);

        // Calculate the areas of triangles PBC, PCA, and PAB
        double areaPBC = calculateArea(x4, y4, x2, y2, x3, y3);
        double areaPCA = calculateArea(x4, y4, x3, y3, x1, y1);
        double areaPAB = calculateArea(x4, y4, x1, y1, x2, y2);

        // Check if the sum of areas PBC, PCA, and PAB equals the total area of ABC
        if (totalArea == areaPBC + areaPCA + areaPAB) {
            return 1; // Point lies inside or on the triangle
        } else {
            return 0; // Point lies outside the triangle
        }
    }


}
