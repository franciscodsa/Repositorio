package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese numero");
        int nume = sc.nextInt();

        int num1= nume/100;
        int num2= (nume%100)/10;
        int num3= (nume%100)%10;

        System.out.print(num3);
        System.out.print(num2);
        System.out.print(num1);
    }

}
