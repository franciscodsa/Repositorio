package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        //28.Programa que pida 4 variables y le reste 1 a cada variable
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        n3-=1;
        n4--; //no lo pongo dentro del sout porque me imprimira primero el original antes de restarle 1
        System.out.println((n1 - 1) + " " + (--n2) + " " + n3 + " " + n4);

    }
}
