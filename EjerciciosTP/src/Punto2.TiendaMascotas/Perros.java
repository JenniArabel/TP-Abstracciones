package Punto2.TiendaMascotas;

public class Perros extends Mascotas {
    private int peso;
    private boolean muerde;

    public Perros(String nombre, int edad, String color,int peso,boolean muerde) {
        super(nombre, edad, color);
        this.muerde=muerde;
        this.peso=peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public static void sonido(){
        System.out.println("Los perros ladran");
    }

}
