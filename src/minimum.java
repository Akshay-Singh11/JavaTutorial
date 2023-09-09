import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && c <= b) {
            System.out.println("B is a minimum no. ");
        }

        else if (b <= a && c <= a) {
            System.out.println("A is a minimum no. ");
        } else {
            System.out.println("C is a minimum no. ");
        }
    }
}
