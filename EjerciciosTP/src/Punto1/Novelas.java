package Punto1;

public class Novelas extends Libro{
    private String tipo;

    public Novelas(String titulo, String autor, int precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    public Novelas(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprimirEnPantalla(){
        System.out.println("El novela se llama " + getTitulo() + ", es de " + tipo + ", cuyo autor es " + getAutor() + " y cuesta " + getPrecio() + " pesos argentinos.");
    }
}
