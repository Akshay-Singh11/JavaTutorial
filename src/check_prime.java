import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        // i< n or i<=n-1
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if ((count >= 1)) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime ");
        }
    }

}
