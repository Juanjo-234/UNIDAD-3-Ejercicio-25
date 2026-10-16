public class MaterialBiblioteca {
    String titulo;
    String editorial;
    int añoEdicion;

    public MaterialBiblioteca(String titulo, int añoEdicion, String editorial) {
        this.titulo = titulo;
        this.añoEdicion = añoEdicion;
        this.editorial = editorial;
    }

    public String mostrarDatos(){
        return "TITULO " + titulo + "|Editorial " + editorial + "|Año de edición " + añoEdicion;
    }
}
