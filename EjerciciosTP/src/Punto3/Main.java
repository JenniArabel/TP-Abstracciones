package Punto3;

public class Main {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(3,4);

        System.out.println("Fraccion 1: "+f1 );
        System.out.println("Fraccion 2: "+f2 );

        Numerica suma = f1.sumar(f2);
        System.out.println("Suma: "+suma);

        Numerica resta = f1.restar(f2);
        System.out.println("Resta: "+resta);

        Numerica multiplicacion = f1.multiplicar(f2);
        System.out.println("Multiplicación: "+ multiplicacion);

        Numerica division= f1.dividir(f2);
        System.out.println("División: "+ division);

    }
}