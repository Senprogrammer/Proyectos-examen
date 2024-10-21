import java.util.Scanner;

public class Sobrecarga {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Dime el primer número");
            float numero1 = sc.nextFloat();
            System.out.println("Dime el segundo muero");
            float numero2 =sc.nextFloat();
            System.out.println("Dime el tercer número ");
            float numero3 = sc.nextFloat();
            float numeroMayor = máximo (numero1 , numero2, numero3);
            System.out.println("El numero mayor es : " + numeroMayor);

        }


        static float máximo(float numero1, float numero2) {
        float numeroMayor = (numero1>numero2) ? numero1 : numero2;

        return numeroMayor;
    }

    static float máximo (float numero1, float numero2 , float numero3){
        float numeroMayorEventual = máximo (numero1 ,numero2);
        float numeroMayor = máximo (numeroMayorEventual , numero3);
        return numeroMayor;


    }
}
