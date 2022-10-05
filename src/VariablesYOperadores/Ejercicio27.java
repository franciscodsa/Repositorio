package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        double parciales = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nota de tres parciales");
        parciales += sc.nextDouble();
        parciales += sc.nextDouble();
        parciales += sc.nextDouble();

        double promParciales = (parciales / 3) * 0.55 ;

        System.out.println("nota de examen final");
        double examFinal = sc.nextDouble();

        System.out.println("nota de trabajo final");
        double trabajoFinal = sc.nextDouble();
        double notaFinal =  (promParciales) + (examFinal * 0.30) + (trabajoFinal * 0.15) ;

        System.out.print("Nota Final: " + notaFinal );
    }
}
