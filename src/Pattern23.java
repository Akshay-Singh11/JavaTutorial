import java.util.*;

public class Pattern23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2 * n - 3;
        while (row <= n) {
            int i = 1;
            int val = 1;
            while (i <= star) {
                System.out.print(val + "  \t");
                val++;

                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("  \t");
                j++;
            }
            int k = 1;
            int val2 = 1;
            if (row == n) {
                k = 2;
            }
            while (k <= star) {
                System.out.print(val2 + " \t");
                val2++;
                k++;
            }
            row++;
            space -= 2;
            star++;
            // val++;
            System.out.println();
        }
    }
}
