import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= n) {
            // Space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;

            }
            // Star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            // next row
            row++;
            star++;
            space--;
            System.out.println();

        }

    }
}
