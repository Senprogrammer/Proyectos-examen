import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Dime el numero Fibonnaci de n:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numeroFibonnaci = fibonnaci(n);
        System.out.println("El resulta Fibonacci de " + n + " es : " + numeroFibonnaci);

    }

    public static int fibonnaci(int n) {
        int resultado;
        if (n == 0 || n==1) {
            resultado = 1;
        } else {
            resultado = fibonnaci(n-1) + fibonnaci (n-2);
        }
        return resultado;
    }


}
