package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("numero es par");
        }
        else {
            System.out.println("numero es impar");
        }

    }
}
