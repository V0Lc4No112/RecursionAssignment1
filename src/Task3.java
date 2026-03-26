static int sumOfIntegers(int n) {
    if (n == 1) return 1;
    return n + sumOfIntegers(n - 1);
}

void main() {
    IO.println("Sum 1..1  = " + sumOfIntegers(1));
    IO.println("Sum 1..5  = " + sumOfIntegers(5));
    IO.println("Sum 1..10 = " + sumOfIntegers(10));
    IO.println("Sum 1..100 = " + sumOfIntegers(100));
}