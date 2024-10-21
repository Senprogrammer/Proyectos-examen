import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = sc.nextLine();

        escribeMiNombre(nombre);

    }
    static void escribeMiNombre(String nombre ){

        System.out.println(nombre + " Buenos días ");
    }

    static void escribeMiNombre(String nombre,int edad ){

        System.out.println(nombre + " Buenos días ");
        System.out.println(edad + " Mayorcete eh! ");
    }
}