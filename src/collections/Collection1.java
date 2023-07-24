package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 {

    public static void main(String[] args) {
        ArrayList<String> miArrayList = new ArrayList<>(); // CREAMOS un ArratList
        // AÑADIMOS varios elementos al ArrayList
        miArrayList.add("HOLA"); 
        miArrayList.add("ADIOS");
        miArrayList.add("BUENAS");
        miArrayList.add("HELLO");
        miArrayList.add("CIAO");
        //SUSTITUIMOS el valor de posicion 2 por otro nuevo
        miArrayList.set(2, "HALLO"); 
        // CONSULTAMOS que TAMAÑO tiene
        System.out.println(miArrayList.size()); 
        // ELIMINAMOS el elemento que esta en la posición 2
        miArrayList.remove(2); 
        // ELIMINAMOS el elemento con valor "HELLO"
        // Solo la primera ocurrencia que haya "HELLO"
        miArrayList.remove("HELLO"); 
        // OBTENEMOS el VALOR del elemento de la posicion 3
        try{
            System.out.println(miArrayList.get(3));
        }
        catch(Exception e){
            System.out.println("Error en la posicion 3 de la colección");
        }
         
        // RECORREMOS el ArrayList para ver sus valores:
        // Modo bucle normal
        System.out.println("Recorrido bucle normal:");
        for (int i = 0; i < miArrayList.size(); i++) { 
            String cadaelemento = miArrayList.get(i); 
            System.out.println(cadaelemento);
        }
        // RECORREMOS el ArrayList para ver sus valores:
        // Modo bucle for-each
        System.out.println("Recorrido con for-each:");
        for (String cadaelemento : miArrayList) { 
            System.out.println(cadaelemento); 
        }
        // COMPROBAMOS si existe un valor en el arraylist
        boolean esta = miArrayList.contains("HOLA"); 
        // BORRAMOS TODOS los elementos del arraylist
        //miArrayList.clear(); 
        // ITERATOR: crear un iteraror
        Iterator<String> it = miArrayList.iterator(); 
        // recorrer un iteraror con un bucle
        while (it.hasNext()) { 
            // extraer elemento dentro del bucle
            String s = it.next(); 
            System.out.println(s);
            if (s.startsWith("A")) {
                System.out.println(s.startsWith("A"));
                // eliminar el elemento que actualmente se esta iterando
                it.remove(); 
            }
        }
        System.out.println("Recorrido despues de eliminar con iterator:");
        for (String cadaelemento : miArrayList) { 
            System.out.println(cadaelemento); 
        }
    }
}
