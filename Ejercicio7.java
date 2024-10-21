import java.util.Scanner;

public class Ejercicio7 {

    /* Diseñar una función que calcule a elevado a n, donde a es reall y n es un entero no negaivo.
    Realizar una versión iterativa y otra repulsiva.
     */

    public static void main (String[] args){
        System.out.println("Dime la base n:  ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Dime el numero a elevar :  a:  ");
        int exponente = sc.nextInt();

        int potencia = potenciaIterativa(base,exponente);
        int potencia2 = potenciaRepulsiva(base , exponente);
        System.out.println( " La potenciaIterativa de " + base + " elevado a " + exponente + " es " + potencia);
        System.out.println( " La potenciaRepulsiva de " + base + " elevado a " + exponente + " es " + potencia2);
    }




        public static int potenciaIterativa(int base , int exponente){
        int resultado = 1;
        for(int i= 0 ; i < exponente ; i++){
            resultado = resultado * base;
            }
        return resultado;
    }

        public static int potenciaRepulsiva (int base , int exponente){
        int resultado = base;
        int n = exponente;

        if(n==1){
            return resultado;
        }
        else{
            n--;
            resultado = base * potenciaRepulsiva(resultado, n);
        }
        return resultado;}
}
