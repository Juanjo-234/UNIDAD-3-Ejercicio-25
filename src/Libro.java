public class Libro extends MaterialBiblioteca {
    private String autor;
    private int numeroPaginas;

    public Libro(String titulo, String editorial, int añoEdicion, String autor, int numeroPaginas) {
        super(titulo, añoEdicion, editorial);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String mostrarDatos() {
        return "[Libro] " + super.mostrarDatos() + " | Autor: " + autor + " | Páginas: " + numeroPaginas;

    }
}

