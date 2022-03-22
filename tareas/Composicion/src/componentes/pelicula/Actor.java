package componentes.pelicula;

public class Actor {

    private String nombreActor;
    private int edadActor;
    private String mejorPapel;

    public Actor() {
    }

    public Actor(String nombreActor, int edadActor, String mejorPapel) {
        this.nombreActor = nombreActor;
        this.edadActor = edadActor;
        this.mejorPapel = mejorPapel;
    }

    public String getMejorPapel() {
        return mejorPapel;
    }

    public void setMejorPapel(String mejorPapel) {
        this.mejorPapel = mejorPapel;
    }

    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public int getEdadActor() {
        return edadActor;
    }

    public void setEdadActor(int edadActor) {
        this.edadActor = edadActor;
    }

    public void mejorPapel(String mejorPapel) {
        System.out.println(this.nombreActor + " tuvo su mejor papel con el personaje: " + mejorPapel);
    }

    @Override
    public String toString() {
        return "Actor{" + "nombreActor=" + nombreActor + ", edadActor=" + edadActor + ", mejorPapel=" + mejorPapel + '}';
    }

}
