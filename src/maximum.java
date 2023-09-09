import java.util.Scanner;

public class maximum {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc;
        sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("a is greater no. " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b is a greater no. " + b);
        }

        else {
            System.out.println("c is a greater no. " + c);
        }

    }

}
