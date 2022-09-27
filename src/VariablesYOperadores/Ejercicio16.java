package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
    //16. realiza un programa que pida el lado de un cuadrado

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzaca lado de un cuadrado");
        double lado = sc.nextDouble();

        //calcular perimetro de cuadrado

        System.out.println("el perimetro del cuadrado es: " + lado*4);
    }
}
