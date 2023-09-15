package Punto4;

public class Terrestre {
    public static void main(String[] args) {
    }
    int VelocidadActual;
    int VelocidadMaxima;
    Terrestre(int VelocidadActual, int VelocidadMaxima) {
        super();
    }
    void acelerar(int velocidad) {
        int vel = VelocidadActual + velocidad;
        if (vel > VelocidadMaxima) {
            System.out.println("Supera la velocidad máxima permitida");
        } else {
            VelocidadActual = vel;
        }
    }
    void frenar(int velocidad) {
        int vel = VelocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa");
        } else {
            VelocidadActual = vel;
        }
    }
    public int CalcularRevolucionesMotor(int fuerza, int radio) {
        return (fuerza*radio);
    }
}
