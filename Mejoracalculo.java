import java.util.*;

public class Mejoracalculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num1 = (int) (Math.random() * 100 + 1);
        int Num2 = (int) (Math.random() * 100 + 1);
        int Puntuacion = 1000;
        int  Sumacorrecta = Num1 + Num2;
        int RespuestaUsu;
        int intentos = -1;
        int puntuacion;
        do{
            System.out.println("Cúanto es la suma de " + Num1 + " + " + " " + Num2);
             RespuestaUsu = sc.nextInt();
             intentos ++;

        }
        while ((Puntuacion > 0) && (Sumacorrecta != RespuestaUsu));
       String Usu = (Sumacorrecta==RespuestaUsu) ? "Has acertado la suma" : "No has acertado la suma";
        int quitarPuntos= intentos * 50;
        puntuacion = Puntuacion - quitarPuntos;
       System.out.println("Tu puntuación es:" + puntuacion);
    }
}

