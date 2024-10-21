import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca  su año de nacimiento:");
        int numero = sc.nextInt();
        Date date = new Date();
        System.out.println(date.toString());

        int edad = date.getYear() - numero + 1900;
        System.out.println(" tienes " + edad + " años de edad.");

        if ((edad >= 0) && (edad < 50)){
            System.out.println(" Perteneces a la zona 1 ");
        }
           else if ((edad >= 50) && (edad <100)) {
                System.out.println(" Perteneces a la zona 2 ");
            }
           else if ((edad >= 100) && (edad <1000)) {
                System.out.println(" Perteneces a la zona 3 ");
           }
    }
}


