package org.chxm;

import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for(int i = 0; i <a.length; i++){
            a[i] = s.nextInt();
        }

        System.out.println("Ingrese el numero a buscar: ");
        int numBuscado = s.nextInt();
        int i= 0;
        while (i <a.length && a[i] != numBuscado){
            i++;
        }
        if( i == a.length){
            System.out.println("Número no encontrado");
        } else if(a[i] == numBuscado){
            System.out.println("Encontrado en la posición: " + i);
        }
    }
}
