package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese cantidad de numeros a introducir");
        int cantidad= sc.nextInt();
        int mayor = 0, menor = 0, igual = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese un numero:");
            int num = sc.nextInt();
            if (num > 0){
                mayor +=1;
            } else if (num < 0) {
                menor +=1;
            }else{
                igual +=1;
            }
        }
        System.out.println("Hay " + mayor + " mayores a cero, " + menor + " menores a cero y " + igual + " iguales a cero");

    }
}
