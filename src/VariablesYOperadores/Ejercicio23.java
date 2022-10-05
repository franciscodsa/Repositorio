package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        //pida numero y porcentaje
        Scanner sc = new Scanner(System.in);
        System.out.println("numero: ");
        double num = sc.nextDouble();
        System.out.println("porcentaje: ");
        double porcentaje = sc.nextDouble();

        double porcentajeCalculado = num * (porcentaje/100);
        System.out.println(porcentajeCalculado);

        System.out.println("el numero sumando el porcentaje es: " + (num  + porcentajeCalculado) + " y el numero menos el porcentjae pedido: " + (num - porcentajeCalculado));

    }
}
