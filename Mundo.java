import java.util.*;

public class Mundo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" ¿A que hemisferio pertenece norte  o sur ?");
        String hemisferio = sc.nextLine();
        System.out.println(" perteneces al hemisferio " + hemisferio);


        System.out.println(" ¿A que lado pertenece oeste  o este  ?");
        String lado = sc.nextLine();
        System.out.println(" perteneces al lado " + lado);

        if (hemisferio.equals("sur")) { //Si el hemisferio es norte
            if (lado.equals("oeste")) { // Si es del oeste
                System.out.println("");
                System.out.println(" Perteneces a América del sur ");
            } else if (lado.equals("este")) {
                System.out.println("");
                System.out.println("Perteneces a África");
            }
        } else if (hemisferio.equals("norte")) {
            if (lado.equals("oeste")) {
                System.out.println("");
                System.out.println("Pertences a Ameríca del norte");
            } else if (lado.equals("este")) {
                System.out.println("");
                System.out.println(" Perteneces a Europa ");
            }
        }
    }
}