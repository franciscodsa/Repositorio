package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce base ");
        int a = sc.nextInt();
        System.out.println("introduce altura");
        int b = sc.nextInt();
        System.out.println("introduce caracte");
        char l = sc.next().charAt(0);

        if (a <= 0 || b <= 0) {
            System.out.println("ese numero no vale");

        } else if (a > b) {
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print(l + " ");
                }
                System.out.println("");
            }

        } else {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(l + " ");
                }
                System.out.println("");
            }
        }
    }
}
