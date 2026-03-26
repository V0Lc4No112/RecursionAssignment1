public class Task2 {

    static int sumOfArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumOfArray(arr, n - 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        System.out.println("Array: [3, 1, 4, 1, 5, 9]");
        System.out.println("Sum of first 1 element  = " + sumOfArray(arr, 1));
        System.out.println("Sum of first 3 elements = " + sumOfArray(arr, 3));
        System.out.println("Sum of first 4 elements = " + sumOfArray(arr, 4));
        System.out.println("Sum of all 6 elements   = " + sumOfArray(arr, 6));
    }
}