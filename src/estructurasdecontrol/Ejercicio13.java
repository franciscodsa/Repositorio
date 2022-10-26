package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese precio por kilo");
        double precio = sc.nextDouble();
        System.out.println("ingrese si es tipo A o B");
        char tipo = sc.next().charAt(0);
        System.out.println("ingrese si es tamaño 1 o 2");
        int tamaño = sc.nextInt();
        System.out.println("ingrese kilos que se venderan");
        double kilos = sc.nextDouble();

        if (tipo == 'A'){
            if ( tamaño == 1){
                precio += 0.20;
            }else {
                precio += 0.30;
            }

        }else if (tipo == 'B'){
            if (tamaño == 1){
                precio -= 0.30;
            }else {
                precio -= 0.50;
            }
        }

        System.out.println("precio: " + (kilos * precio) + "€");
    }
}
