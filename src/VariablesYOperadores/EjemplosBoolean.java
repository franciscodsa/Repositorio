package VariablesYOperadores;

public class EjemplosBoolean {
    public static void main(String[] args) {
        boolean apto= false;
        System.out.println("Es apto?" + apto);

        //operadore logico
        //Usuario: ! Not
        System.out.println(!apto);


        //&& and
        boolean v1= true;
        boolean v2= true;
        boolean v3= v1 && v2;

        System.out.println("and " + v3);

        // || or
        v1= true;
        v2= false;
        v3= v1 || v2;

        System.out.println("or " + v3);

        //XOR ^
        v1= true;
        v2= true;
        v3= v1 ^ v2;

        System.out.println("XOR " + v3);

        //1º not, 2º XOR, 3º or, 4º and --> orden de operaciones


        boolean frio = false; //no hace frio
        boolean seco = true; //hace buen tiempo
        boolean verano = false; // no estamos en verano
        boolean trekking = seco && (!frio || verano); //true, nos vamos de trekking

    }
}
