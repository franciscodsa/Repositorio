package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        //pido precio de producto
        System.out.println("precio del producto");
        Scanner sc= new Scanner(System.in);
        double precio = sc.nextDouble();

        //cantidad de productos
        System.out.println("cantidad de productos");
        int cantidad = sc.nextInt();

        //porcentaje de IVA que aplica
        System.out.println("IVA que aplica");
        double porcentajeIVA = sc.nextDouble();

        //calcular total

        System.out.println("Total: " + ((precio * cantidad) + ((precio * cantidad) * (porcentajeIVA/100))));


    }
}
