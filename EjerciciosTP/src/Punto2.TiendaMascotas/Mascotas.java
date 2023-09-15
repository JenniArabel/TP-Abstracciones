package Punto2.TiendaMascotas;

public class Mascotas {
    private String nombre;
    private int edad;
    private String color;

    public Mascotas(String nombre, int edad, String color) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Mascotas mascota1=new Mascotas("Toby",11,"Blanco");

        Perros perro1=new Perros("Dulce",14,"Marron",30,true);
        Gatos gato1=new Gatos("Blanco",6,"blanco",1,2);

        perro1.sonido();
        gato1.sonido();

        System.out.println(perro1.getNombre()+" tiene "+ perro1.getEdad()+ " años, es de color "+ perro1.getColor()+" y su peso es de "+ perro1.getPeso()+" kg, y muerde? "+ perro1.isMuerde());
    }


}
