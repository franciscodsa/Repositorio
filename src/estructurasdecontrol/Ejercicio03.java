package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que" + num2);
        }
        else {
            System.out.println(num1 + " es menor que" + num2);
        }
    }
}
