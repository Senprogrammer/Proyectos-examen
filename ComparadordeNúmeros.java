import java.util.*;

public class ComparadordeNúmeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escriba 3 número para ordenarlos de mayor a menor");
        System.out.println(" Escriba el primer número ");
        int num1 = sc.nextInt();
        System.out.println(" Escriba el segundo número ");
        int num2 = sc.nextInt();
        System.out.println(" Escriba el tercer número ");
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num2 > num3)){
            if(num2 > num3){
                System.out.println(num1 + " " + num2 + " " + num3);
            }
            else{
                System.out.println(num1 + " " +num3 + " " + num2);
            }
        }
        else if ((num2 > num3) && (num2>num1)) {
            if (num3 > num1) {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
            else {
                System.out.println(num2 + " " + num1 + " " + num3);
            }
        }
        else if ((num3 > num1) && (num3 > num2)){
            if (num1 > num2){
                System.out.println(num3 + " " + num1 + " " + num2);
            }
        }
    }
}
