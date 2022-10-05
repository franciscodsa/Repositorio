package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total de compra");
        double totCompra = sc.nextDouble();
        System.out.println("Su compra despues del descuento de 15%: " + (totCompra - (totCompra*0.15)) );
    }
}
