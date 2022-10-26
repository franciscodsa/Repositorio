package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dia mes año");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();

        if (año != 0){
            if (mes == 1 || mes == 3 || mes == 5 || mes== 7 || mes == 10 || mes == 12){
                if (dia <=31 && dia>0){
                    System.out.println("fecha correcta");
                }else {
                    System.out.println("fecha incorrecta");
                }
            }else if (mes == 4 || mes == 6 || mes == 8 || mes== 9 || mes == 11){
                if(dia <=30 && dia > 0){
                    System.out.println();
                }else{
                    System.out.println("incorrecto");
                  }
            } else if ((mes == 2) && (año % 4 == 0 && año % 100 != 0) || (año % 400 ==0)) {
                System.out.println("año bisiesto");
            }
        }else{
            System.out.println("año incorrecto");
        }
    }
}

