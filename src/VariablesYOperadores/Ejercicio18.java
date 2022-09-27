package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        //18. Hacer un programa que lea una temperatura en grados centígrados, y la calcule y
        //visualice en las escalas: (reamur, Fahrenheit y kelvin). Teniendo en cuenta:
        //
        //Reamur = Centígrados x 0.8
        //Fahenheit = (Centígrados * 9/5)+32
        //Kelvin = Centígrados + 273

        Scanner sc = new Scanner(System.in);
        double grados = sc.nextDouble();
        System.out.println("inserte grados centigrado");

        System.out.println("En reamur son: " + grados*0.8);
        System.out.println("En farenheit son: " + (grados*(9/5)+32));
        System.out.println("En kelvin son: " + grados + 273);
    }
}
