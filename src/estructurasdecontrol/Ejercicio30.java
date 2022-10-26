package estructurasdecontrol;

public class Ejercicio30 {
    public static void main(String[] args) {
        int sum=0;
        double fact=1;

        for (int i = 1; i <=30; i++) {
            sum +=i;
            fact *= i;
        }

        System.out.println("suma= " + sum + " fact= " + fact);
    }
}