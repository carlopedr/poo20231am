package exceptions;

import java.util.Scanner;

public class EjemploExcep1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        numero = entrada.nextInt();
        int cuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es" + cuadrado);
    }
}
