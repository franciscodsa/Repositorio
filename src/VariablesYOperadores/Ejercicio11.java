package VariablesYOperadores;

import java.util.Scanner;

//11.Dado un número de dos cifras, escribe un programa que permita obtener el número
//invertido. Ejemplo, si se introduce 23 que muestre 32.
public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("inserte numero a invertir");
        int num = sc.nextInt();

        System.out.println("numero invertido: " + num%10 + "" + num/10); //num%10 da las unidades de un numero de dos cifras dividido entre 10. Las decenas se obtienen dividiendo entre 10 num/10
    }
}
