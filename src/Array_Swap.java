public class Array_Swap {
    public static void main(String[] args) {

        // int arr[] = { 3, 5, 1, 7, 8 };
        // C/c++-Type declaration

        int[] arr = { 3, 5, 1, 7, 8 };
        // Java -type declaration

        System.out.println(arr[0] + " " + arr[1]);
        Swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);

    }

    public static void Swap(int arr, int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}