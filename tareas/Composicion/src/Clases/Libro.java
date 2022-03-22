package Clases;

import componentes.libro.Autor;
import componentes.libro.Editorial;
import java.awt.Color;

public class Libro {

    private String nombreLibro;
    private Color color;
    private Autor escritor;
    private Editorial distribuidor;

    public Libro() {
        escritor = new Autor();
        distribuidor = new Editorial();
    }

    public Libro(String nombreLibro, Color color, Autor escritor, Editorial distribuidor) {
        this.nombreLibro = nombreLibro;
        this.color = color;
        this.escritor = escritor;
        this.distribuidor = distribuidor;
    }

    public Editorial getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(Editorial distribuidor) {
        this.distribuidor = distribuidor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombreLibro=" + nombreLibro + ", color=" + color + ", escritor=" + escritor + ", distribuidor=" + distribuidor + '}';
    }

}
