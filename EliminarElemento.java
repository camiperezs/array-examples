package org.chxm;

import java.util.Scanner;

public class EliminarElemento {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        int[] b = new int[a.length-1];

        for(int i = 0; i < a.length ; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese una posición a eliminar [entre 0 y 0]");
        int resp = s.nextInt();

        for(int i = resp ; i < a.length -1; i++){
            a[i] = a[i + 1];
        }
        System.arraycopy(a, 0, b, 0, b.length);
        for(int i= 0 ; i < b.length; i++){
            System.out.println(i +" => " + b[i]);
        }
    }
}
