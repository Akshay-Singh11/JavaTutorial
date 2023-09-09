import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= n) {
            // Space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;

            }
            int val = 1;
            int j = 1;
            while (j <= star) {
                System.out.print(val + " ");
                if (j <= star / 2) {
                    val++;
                } else {
                    val--;
                }
                j++;
            }

            row++;
            System.out.println();
            star += 2;
            space--;
        }
    }

}
