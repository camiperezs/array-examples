package org.chxm;

public class OrdenamientoPrincipioFinal {
    public static int[] conversorDeArray(int[] arr){
        int[] a = new int[arr.length];
        int aux= 0;
        for(int i = 0 ; i < arr.length - i ; i++){
            a[aux++] = arr[i];
            a[aux++] = arr[arr.length - 1 - i];
        }
        return a;
    }

    public static void main(String[] args) {
        //Dado un Array de tipo int llamado numeros:
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Se creará un nuevo Array con los valores alternados de principio a fin del Array numeros
        int[] newArr = conversorDeArray(numeros);
        for(int a : newArr){
            System.out.println("a = " + a);
        }
    }
}
