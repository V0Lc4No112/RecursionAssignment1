import java.util.Scanner;
public class Task7 {
    static void fillSpiral(int[][] matrix, int top, int bottom, int left, int right, int num) {
        if (top > bottom || left > right) return;
        for (int i = left; i <= right; i++)      matrix[top][i]    = num++;
        for (int i = top + 1; i <= bottom; i++)  matrix[i][right]  = num++;
        for (int i = right - 1; i >= left; i--)  matrix[bottom][i] = num++;
        for (int i = bottom - 1; i > top; i--)   matrix[i][left]   = num++;
        fillSpiral(matrix, top + 1, bottom - 1, left + 1, right - 1, num);
    }
    static void printMatrix(int[][] matrix, int n) {
        int width = String.valueOf(n * n).length() + 1;
        for (int[] row : matrix) {
            for (int j = 0; j < n; j++)
                System.out.printf("%" + width + "d", row[j]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        fillSpiral(matrix, 0, n - 1, 0, n - 1, 1);
        printMatrix(matrix, n);
        sc.close();
    }
}