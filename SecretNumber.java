import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NumeroSecreto = (int) (Math.random() * 100 + 1);
        System.out.println("Intente adivinar un número del 1 al 100");
        int NumeroUsu = sc.nextInt();

        while ((NumeroUsu != NumeroSecreto) && (NumeroUsu != -1)) {
            String esMenor = (NumeroUsu < NumeroSecreto) ? "Es Menor que el número a adivinar" : "";
            String EsMayor = (NumeroUsu > NumeroSecreto) ? "Es Mayor que el número a adivinar" : "";
            if (NumeroUsu < NumeroSecreto) {
                System.out.println("El número " + " " + NumeroUsu + " " + esMenor);
            } else if (NumeroUsu > NumeroSecreto) {
                System.out.println("El número " + " " + NumeroUsu + " " + EsMayor);
                System.out.println("Dime otro numero");
            }

            NumeroUsu = sc.nextInt();

        }


        if (NumeroUsu == NumeroSecreto) {
            System.out.println("Has acertado!!");
        } else if (NumeroUsu == -1) {
            System.out.println("te has rendido");
        }

    }
}