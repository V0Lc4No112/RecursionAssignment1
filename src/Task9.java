import java.util.Scanner;
public class Task9 {
    static void permute(char[] arr, int start) {
        if (start == arr.length - 1) {
            System.out.println(new String(arr));
            return;
        }
        for (int i = start; i < arr.length; i++) {
            char tmp = arr[start]; arr[start] = arr[i]; arr[i] = tmp;
            permute(arr, start + 1);
            tmp = arr[start]; arr[start] = arr[i]; arr[i] = tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.next();
        System.out.println("All permutations of \"" + input + "\":");
        permute(input.toCharArray(), 0);
        sc.close();
    }
}