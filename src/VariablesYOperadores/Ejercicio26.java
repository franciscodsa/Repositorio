package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo base:");
        double sueldoBase = sc.nextDouble();

        double totVentas = 0;
        System.out.println("Primera venta:");
        totVentas += sc.nextDouble();
        System.out.println("Segunda venta:");
        totVentas += sc.nextDouble();
        System.out.println("Tercera venta:");
        totVentas += sc.nextDouble();


        System.out.println("Salario total: " + (sueldoBase + (totVentas * 0.10)) + "€");
    }
}
