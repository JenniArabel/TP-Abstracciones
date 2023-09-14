package Punto1;

import org.w3c.dom.ls.LSOutput;

public class LibrosTexto extends Libro{
    private String facultad;
    private String curso;

    public LibrosTexto(String titulo, String autor, int precio, String facultad, String curso) {
        super(titulo, autor, precio);
        this.facultad = facultad;
        this.curso = curso;
    }

    public LibrosTexto(String facultad, String curso) {
        this.facultad = facultad;
        this.curso = curso;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimirEnPantalla() {
        System.out.println("El libro se llama " + getTitulo() + ", cuyo autor es " + getAutor() + " y cuesta " + getPrecio() + " pesos argentinos. Este libro pertenece a la Facultad de " + facultad + ", y fue hecho especialmente para el curso de " + curso + ".");
    }
}
