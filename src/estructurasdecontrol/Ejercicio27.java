package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero positivo: ");
        int n = sc.nextInt();
        if(n <= 0){
            System.out.println("ese numero no vale");
        }else {
            char l = sc.next().charAt(0);
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n; j++) {
                    System.out.print(l + " ");
                }
                System.out.println("");
            }
        }


    }
}
