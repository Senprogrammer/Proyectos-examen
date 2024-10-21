import java.util.Scanner;

public class Trianguloin {
    public static void main(String[] args) {
        System.out.println(" Dime n ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (i * 2) - 1; l++) {
                System.out.print(" * ");

            }
            System.out.println(" ");

        }
    }
}
