import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("This age Category Eligible for voting ,Driving License,Pan Card");
        } else {
            System.out.println("Not elgibile");
        }
    }

}
