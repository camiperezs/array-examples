package org.chxm;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] claseMatematica, claseHistoria, claseLenguaje;
        claseMatematica = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        int sumNotasMatematica = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        System.out.println("Ingrese la nota de Matemática de los 7 alumnos:");
        for (int i = 0; i < claseMatematica.length; i++) {
            claseMatematica[i] = s.nextInt();
        }
        System.out.println("Ingrese la nota de Historia de los 7 alumnos:");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextInt();
        }
        System.out.println("Ingrese la nota de Lenguaje de los 7 alumnos:");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextInt();
        }

        System.out.println("Calculando promedio de materias...");
        for(int i = 0; i < 7 ; i++){
            sumNotasMatematica += claseMatematica[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }
        double promedioMat = sumNotasMatematica/claseMatematica.length, promedioHis = sumNotasHistoria/claseHistoria.length, promedioLen = sumNotasLenguaje/claseLenguaje.length;
        double promedioTotal = (promedioMat + promedioHis + promedioLen) / 3;
        System.out.println("Promedio de la Clase Matemática: " + (promedioMat));
        System.out.println("Promedio de la Clase Historia: " + (promedioHis));
        System.out.println("Promedio de la Clase Lenguaje: " + (promedioLen));
        System.out.println("Promedio total del curso: " + (promedioTotal));
        System.out.println("-----------------------------------------------");
        System.out.println("Ingrese identificador del alumno (de 0 a 6) :");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematica[id] + claseHistoria[id] + claseLenguaje[id])/3;
        System.out.println("Promedio Alumno nro " + id + ": " + promedioAlumno);

    }
}
