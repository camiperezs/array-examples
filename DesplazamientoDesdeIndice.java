package org.chxm;

import java.util.Scanner;

public class DesplazamientoDesdeIndice {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.print("Ingrese el indice del numero que desea cambiar (de 0 a 9): ");
        int indice = s.nextInt();
        System.out.print("Ingrese el número que desea colocar en el arreglo: ");
        int numNuevo = s.nextInt();

        for(int i = a.length -2 ; i >= indice ; i--){
            a[i+1] =a[i];
        }
        a[indice] = numNuevo;
        System.out.println("Nuevo arreglo: ");
        for(int i = 0; i < a.length; i++){
            System.out.println("Indice " +i+", numero: " + a[i]);
        }

    }
}
