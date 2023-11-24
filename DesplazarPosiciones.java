package org.chxm;

import java.util.Scanner;

public class DesplazarPosiciones {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        int ultimo;

        System.out.println("Ingrese 10 números enteros: ");
        for(int i = 0; i<a.length; i++){
            a[i] = s.nextInt();
        }
        ultimo = a[a.length - 1];
        System.out.println("Reposicionando números...");
        for(int i= a.length - 2; i >= 0 ;i--){
            a[i+1] = a[i];
        }
        a[0] = ultimo;

        System.out.println("El nuevo ordenamiento de los numeros son: ");
        for(int i = 0; i < a.length; i++){
            System.out.println("Posición " + i + ", numero: " + a[i]);
        }
    }
}
