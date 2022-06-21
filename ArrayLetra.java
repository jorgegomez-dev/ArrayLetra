package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una cadena");

        String palabra = sc.nextLine();
        int cont = 0; //funciona como acumulador de cantidad de letras 'a'
        char letra = 'a'; //letra a buscar coincidencias
        char[] arrayChar = palabra.toCharArray(); //aca te cambie el nombre del array de arrayString a arrayChar
        ArrayList<Integer> arrayPosiciones = new ArrayList(); // creamos un Array dinamico, porque no sabemos cuantas veces se
                                                                //va a repetir la variable char letra.

        for (int i = 0; i < arrayChar.length; i++){
            if(arrayChar[i]==letra) {
                cont++;
                arrayPosiciones.add(i);
            }
        }
        System.out.println("La letra " + "*" + letra + "*" + " se repite " + cont + " veces y se encuentra en la o las posiciones: " + arrayPosiciones.toString());
    }
}
