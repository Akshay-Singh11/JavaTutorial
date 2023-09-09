import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);

        int English = sc.nextInt();
        int DBMS = sc.nextInt();
        int C_O = sc.nextInt();
        int Math = sc.nextInt();
        int OOPS = sc.nextInt();

        int avg = (English + DBMS + C_O + Math + OOPS) / 5;

        if (avg >= 75 && 65 <= avg) {
            System.out.println("Grade is A");
        } else if (avg >= 65 && 55 <= avg) {
            System.out.println("Grade is B");
        } else if (avg >= 55 && 45 <= avg) {
            System.out.println("Grade is C");
        } else if (avg >= 45 && 35 <= avg) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is E");
        }
    }

}
