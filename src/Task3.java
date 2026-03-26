public class Task3 {

    static int sumOfIntegers(int n) {
        if (n == 1) return 1;
        return n + sumOfIntegers(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Sum 1..1  = " + sumOfIntegers(1));
        System.out.println("Sum 1..5  = " + sumOfIntegers(5));
        System.out.println("Sum 1..10 = " + sumOfIntegers(10));
        System.out.println("Sum 1..100 = " + sumOfIntegers(100));
    }
}