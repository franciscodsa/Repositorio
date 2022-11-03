package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double sum= 0;
        for (int i = 0; i < 4; i++) {
            double num = sc.nextInt();
            sum += num;
        }

        System.out.println(sum/4);
    }
}
