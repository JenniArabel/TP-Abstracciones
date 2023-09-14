package Punto1;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Boulevard", "Salvador Flor",9800);
        libro1.imprimirEnPantalla();


        LibrosTexto libro2 = new LibrosTexto("Clean Code", "Robert C. Martin", 210000 , "Tecnología", "Desarrollo de Software");
        libro2.imprimirEnPantalla();

        Novelas novela1 = new Novelas("Después de el", "Salvador Flor", 9799,"romance");
        novela1.imprimirEnPantalla();
    }
}
