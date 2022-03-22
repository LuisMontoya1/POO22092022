package ico.fes;

public class Foco {
    private String color;
    private String tipo;
    private int tamano;

    public Foco() {
    }

    public Foco(String color, String tipo, int tamano) {
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", tamano=" + tamano + '}';
    }
}
