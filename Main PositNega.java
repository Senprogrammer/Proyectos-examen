import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*Práctica de clase 1
        Determinar si un número es positivo o negativo sin hacer uso de condicionales.

        1. se emitirá un mensaje pidiendo un número por pantala.
        2. Se hará uso de un Scanner para recoger ese número
        3. Se realizará la comprobación, emitiendo el mensaje:
            a)
            b)
         */
        //Primero lo haremos con condicionales

        Scanner sc = new Scanner(System.in);
        System.out.printf(" Introduce un número: ");
        int numero = sc.nextInt();
        if (numero > 0) {
            System.out.println(" El número " + numero + " es positivo ");
        } else if (numero < 0) {
            System.out.println(" El número  " + numero + " es negativo ");
        } else if (numero == 0) {
            System.out.println(" El número " + numero + " es zero ");
        }
        /*esta vez usaremos un operador terniario */
        String resultado = (numero < 0) ? " es negativo ❌" : " es positivo ✔";
        System.out.println(resultado);
    }

}