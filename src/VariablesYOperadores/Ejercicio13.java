package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce cantidad de dinero:");
         int billetes= sc.nextInt();

         int bu1= billetes/500;
         int bu2= (billetes%500)/200;
         int bu3= ((billetes%500)%200)/100;
         int bu4= (((billetes%500)%200)%100)/50;
         int bu5= ((((billetes%500)%200)%100)%50)/20;
         int bu6= (((((billetes%500)%200)%100)%50)%20)/10;
         int bu7= ((((((billetes%500)%200)%100)%50)%20)%10)/5;
         int bu8= ((((((billetes%500)%200)%100)%50)%20)%10)/2;
         int bu9= ((((((((billetes%500)%200)%100)%50)%20)%10)%2)%5);

        System.out.println("de 500: "+ bu1 + " de 200: " + bu2 + " de 100: " + bu3 + " de 50: " + bu4 + " de 20: " + bu5 + " de 10: " + bu6 + " de 5: " + bu7 +" de 2: " + bu8  + " de 1: " + bu9 );


    }
}
