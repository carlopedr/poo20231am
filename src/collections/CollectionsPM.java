package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsPM {

    public static void main(String[] args) {
        // CREAMOS un ArratList
        List<String> miArrayList = new ArrayList<>();
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
        miArrayList.remove("HELLO");
        // Solo la primera ocurrencia que haya "HELLO"
        // OBTENEMOS el VALOR del elemento de la posicion 3
        try{
            System.out.println(miArrayList.get(3));
        }
        catch(Exception e){
            System.out.println("Error de indice");
        }
        
        // RECORREMOS el ArrayList para ver sus valores
        // Modo bucle normal
        System.out.println("Recorrido ciclo normal:");
        for (int i = 0; i < miArrayList.size(); i++) {
            String cadaelemento = miArrayList.get(i);
            System.out.println(cadaelemento);
        }
        // RECORREMOS el ArrayList para ver sus valores:
        // Modo bucle for-each
        System.out.println("Recorrido ciclo for-each:");
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
            String s = it.next(); // extraer elemento dentro del bucle
            if (s.startsWith("H")) {
                it.remove(); // eliminar el elemento que actualmente se esta iterando
            }
        }
        System.out.println("Despues de borrar con iterator:");
        for (String cadaelemento : miArrayList) { 
            System.out.println(cadaelemento); 
        }
    }
}
