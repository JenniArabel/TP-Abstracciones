package Punto4;

public class Vehiculo {
    public static void main(String[] args) {
    }
    int VelocidadActual;
    int VelocidadMaxima;

    public Vehiculo(int VelocidadActual, int VelocidadMaxima) {
        this.VelocidadActual = VelocidadActual;
        this.VelocidadMaxima = VelocidadMaxima;
    }
    void imprimir() {
        System.out.println("Velocidad actual = " + VelocidadActual);
        System.out.println("Velocidad máxima = " + VelocidadMaxima);
    }

    void acelerar(int velocidad) {

    }
    void frenar(int velocidad) {

    }
}
