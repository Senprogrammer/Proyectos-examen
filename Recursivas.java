import java.util.Scanner;

public class Recursivas {

    public static void main(String[] args) {
        System.out.println("Dime el numero n:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numeroFactorial = factorial(n);
        System.out.println("El factorial de " + n + " es : " + numeroFactorial);

    }

    public static int factorial(int n) {
        int resultado;
        if (n == 0) {
            resultado = 1;
        } else {
            resultado = n * factorial(n - 1);
        }
        return resultado;
    }
   /* public static int factorial2(int n){
        int resultado = n;
        for (int i = 1 ; i>=n ; i--){
            resultado = n * i;
        }
    }
    return resultado;*/
}
