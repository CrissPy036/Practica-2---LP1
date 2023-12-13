/* Práctica 2 - Ejercicio 01 */

import java.util.Scanner;

public class Practi02Ej1 {
    static String red = "\033[31m"; // variable fija "color rojo"
    static String green = "\033[32m"; // variable fija "color verde"
    static String reset = "\u001B[0m"; // variable fija "reseteo"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        float ingreso;
        float irp = 80000000;
        // Entrada
        System.out.print(reset + "Digite el ingreso anual: ");
        ingreso = scanner.nextFloat();
        // Condicion
        if (ingreso > irp) {
            System.out.print(red + "Debe abonar IRP en el siguiente año. ");
        } else {
            System.out.print(green + "No abona IRP. ");
        }
        scanner.close();
        System.out.print(reset);
    }
}