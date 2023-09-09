public class Func_tion {
    static int val = 100;

    public static void main(String[] args) {
        System.out.println("Hello");
        Add();
        System.out.println("Bye");
    }

    private static void Add() {
        int a = 9;
        int b = 7;
        int c = a + b - Sub();
        Sub();
        System.out.println(c);
    }

    private static void Sub() {
        int a = 9;
        int b = 7;
        int c = a - b;
        System.out.println(c);
    }

}
