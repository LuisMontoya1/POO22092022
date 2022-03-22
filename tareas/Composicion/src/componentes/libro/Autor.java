package componentes.libro;

public class Autor {

    private String nombreAutor;
    private String nacionalidadAutor;
    private int edadActor;

    public Autor() {
    }

    public Autor(String nombreAutor, String nacionalidadAutor, int edadActor) {
        this.nombreAutor = nombreAutor;
        this.nacionalidadAutor = nacionalidadAutor;
        this.edadActor = edadActor;
    }

    public int getEdadActor() {
        return edadActor;
    }

    public void setEdadActor(int edadActor) {
        this.edadActor = edadActor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidadAutor() {
        return nacionalidadAutor;
    }

    public void setNacionalidadAutor(String nacionalidadAutor) {
        this.nacionalidadAutor = nacionalidadAutor;
    }

    public void edadActor(int edadActor) {
        System.out.println(this.nombreAutor + " actualmente tiene " + edadActor + " años");
    }
    
    @Override
    public String toString() {
        return "Autor{" + "nombreAutor=" + nombreAutor + ", nacionalidadAutor=" + nacionalidadAutor + ", edadActor=" + edadActor + '}';
    }

    
    

   
}
