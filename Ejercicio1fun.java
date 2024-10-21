import java.util.Scanner;
public class  Ejercicio1fun {
    public static void main(String[] args) {

         comprendidos();
    }


    static void comprendidos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime el primer número");
        int numero = sc.nextInt();
        System.out.println("Dime el segundo muero");
        int numero2 =sc.nextInt();
        System.out.println("La sucesion seria:");
        for (int i =numero ; i <= numero2; i++){

            System.out.println(i);
        }
        for (int x = numero ; x >=numero2; x--){
            System.out.println(x);
        }

    }
}
