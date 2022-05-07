package ico.fes;

public class Circulo implements Figura {

    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
    }

}
