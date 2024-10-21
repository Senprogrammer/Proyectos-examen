import java.util.Scanner;

public class DivPrimos {
    public static void main(String[] args) {
        System.out.println("Dime el numero n1 :");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int nDivisores = getNumeroDivisoresPrimos(numero);
        System.out.println(" El número " + numero + " tiene " + nDivisores + " divisores primos.");
    }

    static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int getNumeroDivisoresPrimos(int numero) {
        int numeroDivisoresPrimos= 0;
        // voy a i recorriendo de 2 hasta numero -1
        // y voy a comprobar si ese iterador divide a mi número
        for (int i = 2; i < numero; i++) {
            //Prefunte si i divide al número
            if (numero % i == 0) {
                //Lo divide y entonces pregunto si i es primo
                if (esPrimo(i)) {
                    numeroDivisoresPrimos++;

                }
            }

        }
     return numeroDivisoresPrimos;}
}