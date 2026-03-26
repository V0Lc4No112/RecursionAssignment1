static void reverseString(Scanner sc, int n) {
    if (n == 0) return;
    char[] word = sc.next().toCharArray(); // the one allowed char array
    reverseString(sc, n - 1);
    IO.println(new String(word));
}

void main() {
    IO.println("Input:");
    IO.println("3");
    IO.println("Abc");
    IO.println("bcdh");
    IO.println("abcdef");
    IO.println("\nOutput:");
    reverseString(new Scanner("3\nAbc\nbcdh\nabcdef"), 3);
}