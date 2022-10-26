package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        double fact=1;
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            fact *= i;
        }

        System.out.println(" fact= " + fact);
    }
}