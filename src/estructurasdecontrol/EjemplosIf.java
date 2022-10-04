package estructurasdecontrol;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce presupuesto");
        int presupuesto= sc.nextInt();

        if ((presupuesto >= 100 )&& (presupuesto < 200)){
            System.out.println("comprare el basico");
        } else if ((presupuesto >= 200) && (presupuesto < 300)) {
            System.out.println("comprare el estandar");
        } else if (presupuesto >= 300) {
            System.out.println("comprare el premium");
        }
        else {
            System.out.println("esto no es para mi");
        }
    }
}
