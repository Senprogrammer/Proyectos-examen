import java.util.*;

public class Switch {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca un número de 1 al 7 y le diremos el día de la semana que le corresponde:");
        int numero = sc.nextInt();
       switch (numero){
           case 0 :
               System.out.println(" Ni te has esforzado");
               break;
           case 1 :
           case 2 :
           case 3 :
           case 4 :
               System.out.println(" Suspensoh ");
               break;
           case 5 :
               System.out.println(" aprobaoh ");
               break;
           case 6 :
           case 7 :
               System.out.println(" hoy no te castigan soldado 🧐 ");
               break;
           case 8 :
               System.out.println(" Illo no veas que listo 🤓☝");
               break;
           case 9 :
           case 10 :
               System.out.println( " Si hombre tu te has copiado de internet 🙄 ");
               break;
           default:
               System.out.println(" Pero quien te crees tú chaval, anda pon tu nota.");
        }*/
        /*
        switch (numero){
            case 1 -> System.out.println(" Domingo ");
            case 2 -> System.out.println(" Lunes ");
            case 3 -> System.out.println(" Martes ");
            case 4 -> System.out.println(" Miércoles ");
            case 5 -> System.out.println(" Jueves ");
            case 6 -> System.out.println(" Viernes ");
            case 7 -> System.out.println(" Sabado ");

            default -> System.out.println( numero + " Ese día no es correcto; entre el 1 - 7 ");
        }

         */
        System.out.println(" Cuanto es su ingreso anual ");
        int ingreso = new Scanner(System.in).nextInt();
        int  caso = 1;

        if( ingreso> 10000 && ingreso<=50000 ){
            caso = 2;
        }
        else if (ingreso> 50000 && ingreso >= 100000){
            caso = 3;
        }

        int impuestos = switch (caso) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            default -> -1;
        };
        System.out.println(" Pagas un " + impuestos + " % de impuestos");
    }
}


