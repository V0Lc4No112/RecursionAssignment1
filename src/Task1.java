static int sumOfSquares(int n) {
    if (n == 1) return 1;
    return n * n + sumOfSquares(n - 1);
}

void main() {
    int n = 4;
    IO.println("n = " + n);
    IO.println("1^2 + 2^2 + 3^2 + 4^2 = " + sumOfSquares(n));
}