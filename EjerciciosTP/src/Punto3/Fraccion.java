package Punto3;

public class Fraccion extends Numerica{

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador +"/"+ denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;

        Fraccion fraccion = (Fraccion) ob;

        if (numerador != fraccion.numerador) return false;
        return denominador == fraccion.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.denominador + otraFraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
        }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.denominador - otraFraccion.numerador * this.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if(numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.numerador;
            int nuevoDenominador = this.denominador * otraFraccion.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otraFraccion = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otraFraccion.denominador;
            int nuevoDenominador = this.denominador * otraFraccion.numerador;
            if (nuevoDenominador == 0) {
                throw new ArithmeticException("No se puede dividir por 0");
            }
            return new Fraccion(nuevoNumerador, nuevoDenominador);
            }
            return null;
    }
}
