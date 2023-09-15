package Punto2.TiendaMascotas;

public class Gatos extends Mascotas{
   private int alturaDeSalto;
   private int longitudDeSalto;

    public Gatos(String nombre, int edad, String color,int alturaDeSalto,int longitudDeSalto) {
        super(nombre, edad, color);
        this.alturaDeSalto=alturaDeSalto;
        this.longitudDeSalto=longitudDeSalto;
    }

    public int getAlturaDeSalto() {
        return alturaDeSalto;
    }

    public void setAlturaDeSalto(int alturaDeSalto) {
        this.alturaDeSalto = alturaDeSalto;
    }

    public int getLongitudDeSalto() {
        return longitudDeSalto;
    }

    public void setLongitudDeSalto(int longitudDeSalto) {
        this.longitudDeSalto = longitudDeSalto;
    }

    public static void sonido(){
       System.out.println("Los gatos Maúllan y Ronronean");
   }



}
