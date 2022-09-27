package VariablesYOperadores;

import java.util.Scanner;
//10. Dado un número de dos dígitos, imprime su primer número (las decenas).
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Inserte numero de dos digitos:");
        int numero = sc.nextInt();

        System.out.println("El primer digito es:");
        System.out.println(numero/10);

    }
}
