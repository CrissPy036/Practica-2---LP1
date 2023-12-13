/* Práctica 2 - Ejercicio 02 */

import java.util.Scanner;

public class Practi02Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caracter;

        System.out.println("PROGRAMA JAVA CONDICIONAL - STRING");
        System.out.println("Ingrese - un caracter -> ");
        caracter = scanner.nextLine();
        if (caracter.length() != 1) {
            System.out.println("El caracter no existe!");
        } else if ((caracter.compareTo("A") >= 0) && (caracter.compareTo("Z") <= 0)) {
            System.out.println("El caracter es una MAYÚSCULA");
        } else {
            System.out.println("El caracter NO ES una MAYÚSCULA");
        }
        scanner.close();
    }
}
