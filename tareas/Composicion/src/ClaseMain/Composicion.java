package ClaseMain;

import Clases.Libro;
import Clases.Pelicula;
import componentes.libro.Autor;
import componentes.libro.Editorial;
import componentes.pelicula.Actor;
import componentes.pelicula.Director;
import componentes.pelicula.Productora;
import java.awt.Color;

public class Composicion {

    public static void main(String[] args) {

        //Libro
        Libro lib1 = new Libro("Harry Potter", Color.blue,
                new Autor("J. K. Rowling", "Británica", 56),
                new Editorial("salamandra", "España", 1989));
        System.out.println(lib1);

        //Pelicula
        Pelicula peli1 = new Pelicula("Bastardos sin gloria", 2009,
                new Actor("Brad Pitt", 58, "El club de la pelea"),
                new Director("Quentin Tarantino", "Estadounidense", "Tiempos violentos"),
                new Productora("Lawrence Bender", "Estados Unidos", 1957 ));
        System.out.println(peli1);
    }

}
