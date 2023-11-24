package org.chxm;

import java.util.Scanner;

public class InsertarNumeroEnArregloOrdenado {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese el numero a insertar: ");
        int numNuevo = s.nextInt();
        int indice = 0;
        while(indice < 9 && numNuevo > a[indice]){
            indice++;
        }
        for(int i = a.length -2; i >= indice; i--){
            a[i+1] = a[i];
        }
        a[indice] = numNuevo;
        System.out.println("El nuevo arreglo queda asignado de la siguiente manera: ");
        for(int i = 0; i < a.length; i ++){
            System.out.println("Indice: "+i+", numero: " + a[i]);
        }

    }
}
