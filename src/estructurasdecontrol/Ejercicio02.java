package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo = sc.nextInt();

        if (sueldo > 9000) {
            System.out.println("debes abonar impuestos");
        }
        else {
            System.out.println("no debes abonar impuestos");
        }
    }
}
