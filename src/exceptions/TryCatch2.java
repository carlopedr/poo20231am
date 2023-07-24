package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("escribe un numero entero...");
        try {
            numero = entrada.nextInt();
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es" + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Error, no se introdujo un numero");
        } catch (NumberFormatException ex) {
            System.out.println("Error, el numero tiene formato erroneo");
            return;
        } catch (Exception ex) {
            System.out.println("Error general, no especifico");
            return;
        } finally {
            System.out.println("PASA SIEMPRE por aqui");
        }
        System.out.println("Pasa por aqui si no hay error o el error es InputMismatchException");
    }
}
