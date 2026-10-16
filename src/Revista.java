public class Revista extends MaterialBiblioteca{
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String editorial, int añoEdicion, int numeroEdicion, String mesPublicacion){
        super(titulo, añoEdicion, editorial);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String mostrarDatos() {
        return "[Revista] " + super.mostrarDatos() + " | Edición N°: " + numeroEdicion + " | Mes: " + mesPublicacion;
    }
}
