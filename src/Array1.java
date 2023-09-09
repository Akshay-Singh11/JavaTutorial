public class Array1 {
    public static void main(String[] args) {

        int a;
        int[] arr = new int[5];
        System.out.println(arr);

        int[] other = arr;
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 6;
        arr[3] = 4;
        arr[4] = 98;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr.length);

    }
}
