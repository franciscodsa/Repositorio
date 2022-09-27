package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {


    //19. Pide al usuario dos pares de números x1,y1 y x2,y2, que representen dos puntos en el
    //plano. Calcula y muestra la distancia entre ellos.
    //
    //(https://www.geometriaanalitica.info/formula-de-la-distancia-entre-dos-puntos-
    //geometria-ejemplos-y-ejercicios-resueltos/ )

        Scanner sc = new Scanner(System.in);


        System.out.println("inserte x1:");
        double x1 = sc.nextDouble();
        System.out.println("inserte x2:");
        double x2 = sc.nextDouble();
        System.out.println("inserte y1:");
        double y1 = sc.nextDouble();
        System.out.println("inserte y2:");
        double y2 = sc.nextDouble();


        System.out.println("distancia es: " + Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2)));
    }
}
