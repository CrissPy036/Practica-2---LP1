
/* Práctica 2 - Ejercicio 02 */
import java.util.Scanner;

public class Practi02Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        int num1, num2;
        // Entrada
        System.out.print("Digite el primer número -> ");
        num1 = scanner.nextInt();
        System.out.print("Digite el segundo número -> ");
        num2 = scanner.nextInt();
        // Proceso - Condicional
        if (num1 > num2) {
            System.out.print("El PRIMER NÚMERO es mayor ");
        } else if (num2 > num1) {
            System.out.print("El SEGUNDO NÚMERO es mayor ");
        } else {
            System.out.print("Ambos número son iguales ");
        }
        scanner.close();
    }
}
