package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        //helado en funcios de topping
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe topping:sin topping, oreo, kitkat, brownie, lacasitos.");
        String topping = sc.nextLine();
        double precio = 1.90;

        switch (topping){
            case "sin topping":
                //no hacemos nada es el precio defecto
                break;

            case "oreo":
                precio += 1;
                break;

            case "KitKat":
                precio+=1.50;
                break;

            case "brownie":
                precio+=0.75;
                break;

            case "Lacasitos":
                precio+=0.95;
                break;

            default:
                System.out.println("no tenemos ese topping, lo sentimos");
                System.out.println("el precio del helado sin topping es: " + precio);
        }

        System.out.println("el precio de sue helado es: " + precio);

    }
}
