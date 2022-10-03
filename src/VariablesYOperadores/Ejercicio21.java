package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte nota de primera evaluacion:");
        double num1 = sc.nextDouble();
        System.out.println("inserte nota de segunda evaluacion:");
        double num2 = sc.nextDouble();
        System.out.println("inserte nota de tercera evaluacion:");
        double num3 = sc.nextDouble();


        double media = (num1 + num2 + num3) / 3;
        //queremos mostrar la media con 2 decimales -->souf
        System.out.printf("la media es: %.2f", media);
    }
}
