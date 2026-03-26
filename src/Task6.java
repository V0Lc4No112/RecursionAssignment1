import java.util.Scanner;
public class Task6 {

    static void reverseString(Scanner sc, int n) {
        if (n == 0) return;
        char[] word = sc.next().toCharArray(); // the one allowed char array
        reverseString(sc, n - 1);
        System.out.println(new String(word));
    }
    public static void main(String[] args) {
        System.out.println("Input:");
        System.out.println("3");
        System.out.println("Abc");
        System.out.println("bcdh");
        System.out.println("abcdef");
        System.out.println("\nOutput:");
        reverseString(new Scanner("3\nAbc\nbcdh\nabcdef"), 3);
    }
}