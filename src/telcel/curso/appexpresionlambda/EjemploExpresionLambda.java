package telcel.curso.appexpresionlambda;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploExpresionLambda {

    public static void main(String[] args) {

        Consumer<String> consumidor = (frase) ->{String[] palabras = frase.split("\\s+|\\.|\\,|\\?|\\:|\\;");
        Hashtable<String, Integer> mapLetras = new Hashtable<String, Integer>();

        int minimoLongitud = 1;
        for (String palabra : palabras) {
            String palabraUnica = palabra.toLowerCase();
            if (palabraUnica.length() > minimoLongitud) {
                if (mapLetras.containsKey(palabraUnica)) {
                mapLetras.replace(palabraUnica, mapLetras.get(palabraUnica),
                mapLetras.get(palabraUnica).intValue() + 1);
                } else {
                    mapLetras.put(palabraUnica, 1);

                }
             }
        }
        mapLetras.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue());
         });

    };
        consumidor.accept("uno dos uno sei hola esto es, ejemplo ejemplo y otro ejemplo lambda lambda");

}



    }

