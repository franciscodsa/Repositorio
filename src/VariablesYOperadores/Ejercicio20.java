package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio20 {
    //pide cuatro valores y saca la media
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("inserte numero");
        int num1 = sc.nextInt();
        System.out.println("inserte numero");
        int num2 = sc.nextInt();
        System.out.println("inserte numero");
        int num3 = sc.nextInt();
        System.out.println("inserte numero");
        int num4 = sc.nextInt();

        double media = (num1  + num2 + num3 + num4)/4;

        System.out.println("la media es: " + media);
    }
}
