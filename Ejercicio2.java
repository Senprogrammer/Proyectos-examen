import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el primer número");
         int numero1 = sc.nextInt();
        System.out.println("Dime el segundo muero");
         int numero2 =sc.nextInt();
        System.out.println("Dime el tercer número ");
         int numero3 = sc.nextInt();
         int numeroMayor = máximo (numero1 , numero2, numero3);
         System.out.println("El numero mayor es : " + numeroMayor);

    }


    static int máximo(int numero1, int numero2) {
        int numeroMayor = (numero1>numero2) ? numero1 : numero2;

        return numeroMayor;}


    static int máximo (int numero1 , int numero2 , int numero3 ) {
        int numeroMayorEventual = máximo (numero1 ,numero2);
        int numeroMayor = máximo (numeroMayorEventual , numero3);
        return numeroMayor;
    }

}

