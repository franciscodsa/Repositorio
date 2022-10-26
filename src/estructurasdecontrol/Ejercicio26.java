package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum= 0;
        System.out.println("ingrese 10 numeros");

        for (int i=0; i<10; i++){
            sum += sc.nextInt();
        }

        System.out.println("La media es: " + sum/10);
    }
}
