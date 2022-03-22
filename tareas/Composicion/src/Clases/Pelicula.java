package Clases;

import componentes.libro.Autor;
import componentes.libro.Editorial;
import componentes.pelicula.Actor;
import componentes.pelicula.Director;
import componentes.pelicula.Productora;
import java.awt.Color;

public class Pelicula {

    private String nombrePelicula;
    private int AñoPelicula;
    private Actor artista;
    private Director directivo;
    private Productora produccion;

    public Pelicula() {
        artista = new Actor();
        directivo = new Director();
        produccion = new Productora();
    }

    public Pelicula(String nombrePelicula, int AñoPelicula, Actor artista, Director directivo, Productora produccion) {
        this.nombrePelicula = nombrePelicula;
        this.AñoPelicula = AñoPelicula;
        this.artista = artista;
        this.directivo = directivo;
        this.produccion = produccion;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getAñoPelicula() {
        return AñoPelicula;
    }

    public void setAñoPelicula(int AñoPelicula) {
        this.AñoPelicula = AñoPelicula;
    }

    public Actor getArtista() {
        return artista;
    }

    public void setArtista(Actor artista) {
        this.artista = artista;
    }

    public Director getDirectivo() {
        return directivo;
    }

    public void setDirectivo(Director directivo) {
        this.directivo = directivo;
    }

    public Productora getProduccion() {
        return produccion;
    }

    public void setProduccion(Productora produccion) {
        this.produccion = produccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombrePelicula=" + nombrePelicula + ", A\u00f1oPelicula=" + AñoPelicula + ", artista=" + artista + ", directivo=" + directivo + ", produccion=" + produccion + '}';
    }

}
