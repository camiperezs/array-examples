package org.chxm;

import java.util.Scanner;

public class AgregarElemento {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[a.length+1];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length ; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.print("Ingrese el elemento a agregar: ");
        elemento = s.nextInt();
        System.out.print("Posición en la que desea agregar el elemento: " );
        posicion = s.nextInt();
        System.out.println();

        ultimo = a[a.length-1];
        for(int i = a.length -2 ; i >= posicion; i--){
            a[i+1] = a[i];
        }

        System.arraycopy(a, 0, b, 0, a.length);
        b[posicion] = elemento;
        b[b.length - 1] = ultimo;
        System.out.println("El arreglo nuevo queda:");
        for (int j : b) System.out.println(j);
    }

}
