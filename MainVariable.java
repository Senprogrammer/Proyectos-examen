import static java.lang.Math.*;

public class Main {
   final static double PI = 3.14159;

    public static void main(String[] args) {
        //Definimos variables con diferentes ambitos y tipos.


        int numLados = 3; //Número de lados del triángulo en cuestión
        double diametro = 10.2; //Diametro del diametro del triángulo
        double radio = diametro / 2; // Radio del triangulo 1
        double área = PI * (radio * radio); // Área del triangulo 1
        double área2 = PI * pow(radio, 2); // Área del triangulo 2
        double base = 10; // Base del triangulo 1
        double base2 = 5; // Base del triangulo 2
        double altura = 8; // Altura del triangulo 1
        double altura2 = 4; // Altura del triangulo 2
        double Dmayor = 12; // Diagonal mayor del rombo
        double Dmenor = 6; // Diagonal menor del rombo
        double área_Rombo = (Dmayor * Dmenor) / 2; // Cálculo del área del rombo
        double área_Trian = (base * altura) / 2; // Cálculo del área del triangulo 1
        double área_Trian2 = (base2 * altura2) / 2; //Cálculo del área del triangulo 2

        System.out.println(" el circulo tiene " + área + " cm cuadrados ");
        System.out.println(" el área del triangulo 2 es " + área2 + "cm cuadrados");
        System.out.println(" el área deltriangulo 1 es " + área_Trian + " centrimetros cuadrados ");
        System.out.println(" el área del truango 2 es " + área_Trian2 + "centrimetros cuadrados ");
        System.out.println(" el área del rombo es " + área_Rombo + " cm^2 ");

    }
}