package componentes.pelicula;

public class Director {

    private String nombreDirector;
    private String nacionalidadDirector;
    private String mejorPelicula;

    public Director() {
    }

    public Director(String nombreDirector, String nacionalidadDirector, String mejorPelicula) {
        this.nombreDirector = nombreDirector;
        this.nacionalidadDirector = nacionalidadDirector;
        this.mejorPelicula = mejorPelicula;
    }

    public String getMejorPelicula() {
        return mejorPelicula;
    }

    public void setMejorPelicula(String mejorPelicula) {
        this.mejorPelicula = mejorPelicula;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getNacionalidadDirector() {
        return nacionalidadDirector;
    }

    public void setNacionalidadDirector(String nacionalidadDirector) {
        this.nacionalidadDirector = nacionalidadDirector;
    }

    public void mejorPelicula(String mejorPelicula) {
        System.out.println(this.mejorPelicula + " Es la mejor pelicula de " + nombreDirector);
    }

    @Override
    public String toString() {
        return "Director{" + "nombreDirector=" + nombreDirector + ", nacionalidadDirector=" + nacionalidadDirector + ", mejorPelicula=" + mejorPelicula + '}';
    }

}
