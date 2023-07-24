package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero=0;
        System.out.println("escribe un numero entero...");
        try {
            numero = in.nextInt();
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es" + cuadrado);
        }
        catch (InputMismatchException e) {
            System.out.println("Error en el número ingresado");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Se ha verificado el dato de entrada");
        }
        
    }
}
