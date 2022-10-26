package estructurasdecontrol;

public class EjemploForAnidado {
    public static void main(String[] args) {

        for (int i = 0; i<5; i++){
            System.out.print(i+"i   ");
            for (int j = 0; j < 10; j++) {
                System.out.print(j+"j   ");
            }
            System.out.println(" ");
        }
    }
}
