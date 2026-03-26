import java.util.Scanner;
public class Task8 {
    static void generateSequences(int[] seq, int pos, int n, int k) {
        if (pos == n) {
            for (int i = 0; i < n; i++)
                System.out.print(seq[i] + (i < n - 1 ? " " : "\n"));
            return;
        }
        for (int i = 1; i <= k; i++) {
            seq[pos] = i;
            generateSequences(seq, pos + 1, n, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and k: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("All sequences of length " + n + " with values 1.." + k + ":");
        generateSequences(new int[n], 0, n, k);
        sc.close();
    }
}