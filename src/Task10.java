static boolean isPowerOfTwo(int n) {
    if (n <= 0) return false;
    if (n == 1) return true;
    if (n % 2 != 0) return false;
    return isPowerOfTwo(n / 2);
}

void main() {
    for (int i = 0; i <= 9; i++)
        IO.println(i + " is " + (isPowerOfTwo(i) ? "" : "not ") + "a power of two");
    IO.println("- ".repeat(15).trim());
    for (int i = 10; i <= 32; i += 2)
        IO.println(i + " is " + (isPowerOfTwo(i) ? "" : "not ") + "a power of two");
}