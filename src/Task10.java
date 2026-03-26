public class Task10 {
    static boolean isPowerOfTwo(int n) {
        if (n <= 0)      return false;
        if (n == 1)      return true;
        if (n % 2 != 0)  return false;
        return isPowerOfTwo(n / 2);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++)
            System.out.println(i + " is " + (isPowerOfTwo(i) ? "" : "not ") + "a power of two");
        System.out.println("- ".repeat(15).trim());
        for (int i = 10; i <= 32; i += 2)
            System.out.println(i + " is " + (isPowerOfTwo(i) ? "" : "not ") + "a power of two");
    }
}