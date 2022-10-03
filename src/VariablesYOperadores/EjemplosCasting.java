package VariablesYOperadores;

public class EjemplosCasting {
    public static void main(String[] args) {
        //De int a long
        int num = 100; // int ocupa en memoria 32 bits
        long numGrande = num; // puedo asignar un int a long sin mas (casting implicito)

        // y al reves?
        long numGrande2 = 101; // long ocupa 64 bits
        int entero = (int) numGrande2; // como long ocupa 64 e int solo puede almacenar 32bits hay que hacer un casting explicito
        short numeroCorto = (short) num; // no puedo hacerlo directamente porque int son 32 bits y no "caben" en un short

        // char a int
        char letra = 'a';
        int letraAscii = letra;
        System.out.println(letraAscii);

        //de float a int
        float decimal = 3.1416f;
        double decimalDouble = decimal;

        //de double a float
        double decimalDouble2 = 30000000000000.1234567;
        float decimalF = (float) decimalDouble2;

        //de double a int
        int entero32bits = (int) decimalDouble2;
        System.out.println(entero32bits); //resultado imprevisto

        //de double a short
        short entero16bits = (short) decimalDouble2;
        System.out.println(entero16bits);
        ///
    }
}
