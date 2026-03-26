import java.util.Scanner;
public class Task5 {
    static void reverseSequence (Scanner sc, int n) {
        if (n == 0) return;
        int val = sc.nextInt();
        reverseSequence(sc, n - 1);
        System.out.print(val + " ");
    }
    public static void main(String[] args) {
        System.out.println("Input:  3");
        System.out.println("        1 2 3");
        System.out.print("Output: ");
        reverseSequence(new Scanner("3\n1 2 3"), 3);
        System.out.println();
    }
}