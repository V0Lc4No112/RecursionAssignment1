static void reverseSequence(Scanner sc, int n) {
    if (n == 0) return;
    int val = sc.nextInt();
    reverseSequence(sc, n - 1);
    IO.print(val + " ");
}

void main() {
    IO.println("Input:  3");
    IO.println("        1 2 3");
    IO.print("Output: ");
    reverseSequence(new Scanner("3\n1 2 3"), 3);
    IO.println();
}