public class Array_2 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 7, 8 };
        int[] arr1 = { 31, 51, 11, 71, 81 };
        System.out.println(arr[0] + " " + arr1[0]);
        Swap(arr, arr1);
        System.out.println(arr[0] + " " + arr1[0]);

    }

    public static void Swap(int[] arr, int[] arr1) {
        int[] temp = arr;
        arr = arr1;
        arr1 = temp;
    }

}
