import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Opcion;

        do {
            // Menú de opciones
            System.out.println("::::::Calculadora::::::");
            System.out.println(":::1. Suma :::");
            System.out.println(":::2. Resta :::");
            System.out.println(":::3. Multiplicación :::");
            System.out.println(":::4. División :::");
            System.out.println(":::5. Media Aritmética :::");
            System.out.println(":::6. Potencia :::");
            System.out.println(":::7. Impares :::");
            System.out.println(":::8. Ángulo :::");
            System.out.println(":::9. Distancias:::");
            System.out.println(":::0. Salir :::");
            System.out.print("Elige una opción: ");
            Opcion = sc.nextInt();

            // Solo solicitamos los números si la opción es válida
            if (Opcion >= 1 && Opcion <= 9) {
                System.out.print("Dime el primer número: ");
                float numero = sc.nextFloat();
                System.out.print("Dime el segundo número: ");
                float numero2 = sc.nextFloat();

                float resultado = 0;

                switch (Opcion) {

                    case 1:
                        resultado = suma(numero, numero2);
                        System.out.println("La suma de " + numero + " y " + numero2 + " es " + resultado);
                        break;

                    case 2:
                        resultado = resta(numero, numero2);
                        System.out.println("La resta de " + numero + " y " + numero2 + " es " + resultado);
                        break;

                    case 3:
                        resultado = multiplicacion(numero, numero2);
                        System.out.println("La multiplicación de " + numero + " y " + numero2 + " es " + resultado);
                        break;

                    case 4:
                        if (numero2 != 0) {
                            resultado = division(numero, numero2);
                            System.out.println("La división de " + numero + " entre " + numero2 + " es " + resultado);
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;

                    case 5:
                        System.out.print("Dime el tercer número: ");
                        float numero3 = sc.nextFloat();
                        resultado = media(numero, numero2, numero3);
                        System.out.println("La media de " + numero + ", " + numero2 + " y " + numero3 + " es " + resultado);
                        break;

                    case 6:
                        System.out.print("Dime la base: ");
                        float base = numero; // Usar el primer número como base
                        System.out.print("Dime el exponente: ");
                        float exponente = numero2; // Usar el segundo número como exponente
                        resultado = potenciaIterativa(base, exponente);
                        System.out.println("La potencia de " + base + " elevado a " + exponente + " es " + resultado);
                        break;

                        case 7:
                        System.out.println("Dime el impar a sumar");
                        float impar1 = sc.nextFloat();
                        resultado = sumaImpares(impar1);
                        System.out.println("El resultado de los impares es " + resultado);
                        break;

                        case 8:
                        // Opción para calcular seno, coseno y tangente
                        System.out.print("Dime el ángulo en grados: ");
                        float anguloGrados = sc.nextFloat();
                        double anguloRadianes = Math.toRadians(anguloGrados); // Convertir a radianes
                        System.out.println("Seno: " + Math.sin(anguloRadianes));
                        System.out.println("Coseno: " + Math.cos(anguloRadianes));
                        System.out.println("Tangente: " + Math.tan(anguloRadianes));
                        break;

                    case 9:
                        System.out.println("Dime el punto x1");
                        float x1 = sc.nextFloat(); // Cambiado a float
                        System.out.println("Dime el punto x2");
                        float x2 = sc.nextFloat(); // Cambiado a float
                        System.out.println("Dime el punto y1");
                        float y1 = sc.nextFloat(); // Cambiado a float
                        System.out.println("Dime el punto y2");
                        float y2 = sc.nextFloat(); // Cambiado a float

                        // Calcular la distancia utilizando la fórmula correcta
                        resultado = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Asegurarse de que el resultado sea float
                        System.out.println("La distancia de los puntos X e Y es de " + resultado);
                        break;

                }
            } else if (Opcion != 0) {
                System.out.println("Error: Elija una de las opciones válidas (0-9)");
            }

        } while (Opcion != 0); // Salir si el usuario elige 0

        System.out.println("Gracias por usar la calculadora.");
        sc.close(); // Cerrar el escáner
    }

    public static float suma(float numero, float numero2) {
        return numero + numero2;
    }

    public static float resta(float numero, float numero2) {
        return numero - numero2;
    }

    public static float multiplicacion(float numero, float numero2) {
        return numero * numero2;
    }

    public static float division(float numero, float numero2) {
        return numero / numero2;
    }

    public static float media(float numero, float numero2, float numero3) {
        return (numero + numero2 + numero3) / 3;
    }

    public static float potenciaIterativa(float base, float exponente) {
        float resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static float sumaImpares (float impar1){
        float impar = 1;
        float resultado= 0;
        for (float i = 0 ; i<impar1 ; i++){

           resultado = resultado + impar;
            impar = impar + 2;

        } return resultado;
    }

}
