static void permute(char[] arr, int start) {
    if (start == arr.length - 1) {
        IO.println(new String(arr));
        return;
    }
    for (int i = start; i < arr.length; i++) {
        char tmp = arr[start];
        arr[start] = arr[i];
        arr[i] = tmp;
        permute(arr, start + 1);
        tmp = arr[start];
        arr[start] = arr[i];
        arr[i] = tmp;
    }
}
void main() {
    Scanner sc = new Scanner(System.in);
    IO.print("Enter string: ");
    String input = sc.next();
    IO.println("All permutations of \"" + input + "\":");
    permute(input.toCharArray(), 0);
    sc.close();
}