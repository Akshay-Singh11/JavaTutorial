public class Sum_of_Digit {
    public static void main(String[] args) {
        int n = 3486;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;

        }
        System.out.println(sum);
    }

}

// By Me
// import java.util.Scanner;

// public class Sum_of_Digit {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// while (n != 0) {
// int rem = n % 10;
// sum = sum + rem;
// n = n / 10;
// }
// System.out.println(sum);
// }
// }