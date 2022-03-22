package componentes.libro;

public class Editorial {

    private String nombreEditorial;
    private String pais;
    private int AñoDeFundacion;

    public Editorial() {
    }

    public Editorial(String nombreEditorial, String pais, int AñoDeFundacion) {
        this.nombreEditorial = nombreEditorial;
        this.pais = pais;
        this.AñoDeFundacion = AñoDeFundacion;
    }

    public int getAñoDeFundacion() {
        return AñoDeFundacion;
    }

    public void setAñoDeFundacion(int AñoDeFundacion) {
        this.AñoDeFundacion = AñoDeFundacion;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void AñoDeFundacion(int AñoDeFundacion) {
        System.out.println(this.nombreEditorial + " fue dundado en el año " + AñoDeFundacion);
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEditorial=" + nombreEditorial + ", pais=" + pais + ", A\u00f1oDeFundacion=" + AñoDeFundacion + '}';
    }

    
    

    

}
