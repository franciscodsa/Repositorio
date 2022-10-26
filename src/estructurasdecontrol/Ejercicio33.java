package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese base");
        int base = sc.nextInt();
        System.out.println("ingrese exponente");
        int expo = sc.nextInt();

        int resul = 1;
        for (int i = 0; i < expo; i++) {

            resul*=base;
        }
        System.out.println(resul);
    }
}
