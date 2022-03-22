package componentes.pelicula;

public class Productora {
    
    private String nombreProductora;
    private String pais;
    private int añoFundacion;

    public Productora() {
    }

    public Productora(String nombreProductora, String pais, int añoFundacion) {
        this.nombreProductora = nombreProductora;
        this.pais = pais;
        this.añoFundacion = añoFundacion;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    public void setAñoFundacion(int añoFundacion) {
        this.añoFundacion = añoFundacion;
    }

    public String getNombreProductora() {
        return nombreProductora;
    }

    public void setNombreProductora(String nombreProductora) {
        this.nombreProductora = nombreProductora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

     public void añoFundacion(int añoFundacion) {
        System.out.println(this.nombreProductora + " fue dundada en el año " + añoFundacion);
    }
    
    @Override
    public String toString() {
        return "Productora{" + "nombreProductora=" + nombreProductora + ", pais=" + pais + ", a\u00f1oFundacion=" + añoFundacion + '}';
    }
    
    
}
