package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserte primer numero");
        int a= sc.nextInt();
        System.out.println("inserte segundo numero");
        int b= sc.nextInt();
        int sum = 0;

        if (a < b){
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
            System.out.println(sum);

        }
    }
}