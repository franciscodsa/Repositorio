package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        //17. Calcular el área de un triangulo ( base * altura)/2. Resuelve el ejercicio primero con
        //variables de tipo entero y después con variables de tipo float.

        Scanner sc = new Scanner(System.in);
        System.out.println("inserte base de triangulo");
        double base = sc.nextDouble();
        System.out.println("inserte altura de triangulo");
        double altura = sc.nextDouble();

        System.out.println("el area del triangulo es: " + (base*altura)/2);

    }
}
