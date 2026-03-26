public class Task4 {

    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
    static int sumOfPowers(int b, int n) {
        if (n == 0) return 1;
        return power(b, n) + sumOfPowers(b, n - 1);
    }
    public static void main(String[] args) {
        System.out.println("b=4, n=3:");
        System.out.println("4^0 + 4^1 + 4^2 + 4^3 = " + sumOfPowers(4, 3));
    }
}