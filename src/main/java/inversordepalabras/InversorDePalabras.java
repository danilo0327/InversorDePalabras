
package inversordepalabras;

import java.util.Scanner;


public class InversorDePalabras {

    public static void main(String[] args) {
        
        //Definiendo Variables a usar
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        
        //Creando objeto Tipo Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Texto que se va imprimir para que el usuario ingrese la data al programa.
        System.out.print("Type a word or sentence: ");
        palabra = entrada.nextLine();
        
        //Definición de variable tipo int que me permite contar los caracteres de una variable String
        longitudPalabra = palabra.length();
        
        //Ciclo while para recorrer el String
        while(longitudPalabra != 0) {
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra--; //Decremento de uno en uno.
        }
        
        System.out.print("Word or sentence invested: " +palabraInvertida);
        System.out.println("");
    }
}
