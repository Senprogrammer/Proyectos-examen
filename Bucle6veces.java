import java.util.*;

public class Bucle6veces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aprobados = 0;
        int suspensos = 0;
        int condicionados = 0;
        for (int i = 0; i <= 6; i++) {
            System.out.println("Dime la nota");
            int Nota = sc.nextInt();
            if (Nota > 4) {
                aprobados = aprobados + 1;
            } else if (Nota < 4) {
                suspensos = suspensos + 1;
            } else
                condicionados = condicionados + 1;
        }
        System.out.println("Han habido " + aprobados + " aprobados , " + suspensos + " suspensos , " + condicionados + " condicionados en la clase");
    }
}
