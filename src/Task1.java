public class Task1 {

    static int sumOfSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumOfSquares(n - 1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("n = " + n);
        System.out.println("1^2 + 2^2 + 3^2 + 4^2 = " + sumOfSquares(n));
    }
}