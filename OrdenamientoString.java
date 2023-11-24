package org.chxm;
import java.util.Arrays;

public class OrdenamientoString {
    public static void arregloInverso(String[] arr){
        int total = arr.length;
        int total2= arr.length;
        for (int i = 0 ; i < total2 ; i++){
            String actual = arr[i];
            String inverso = arr[total2 -1 -i];
            arr[i] = inverso;
            arr[total-1-i] = actual;
            total2--;
        }
    }
    public static void ordenamientoBurbuja(String[] arr){
        int total = arr.length;
        for(int i = 0; i  < total - i ; i++){
            for(int j = 0; j < total -1 -i ; j++){
                if(arr[j+1].compareTo(arr[j]) < 0){
                    String aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
    public static void mostrarArray(String[] arr){
        for(String aux : arr){
            System.out.println("producto = " + aux);
        }
    }
    public static void mostrarArrayDesc(String[] arr){
        int total = arr.length;
        for(int i = total -1; i >=0; i--){
            System.out.println("para i = " + i + " valor: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        //Dado un Array de tipo String con nombre de productos:
        String[] producto = {"Kingston Pendrive 64GB","Samsung Galaxy","Disco Duro SSD Samsung Externo", "Asus Notebook",
                "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"  };
        //Ordenamiento Sort
        Arrays.sort(producto);
        //De forma ascendente
        System.out.println("De forma ascendente");
        mostrarArray(producto);
        //De forma descendente
        System.out.println("De forma descendente");
        mostrarArrayDesc(producto);
        //Usando la clase arregloInverso
        System.out.println("Arreglo inverso");
        arregloInverso(producto);
        mostrarArray(producto);
        //Usando el ordenamientoBurbuja
        System.out.println("Ordenamiento burbuja");
        ordenamientoBurbuja(producto);
        mostrarArray(producto);
    }
}
