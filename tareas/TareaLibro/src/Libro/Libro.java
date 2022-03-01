package Libro;

import java.awt.Color;

public class Libro {

    public static void main(String[] args) {

        //Harry Potter
        Atributos HarryP = new Atributos();
        HarryP.setTitulo("Harry Potter y la piedra filosofal");
        HarryP.setAutor("J. K. Rowling");
        HarryP.setEditorial("Salamandra");
        HarryP.setTipo("Fantasia");
        HarryP.setColor(Color.blue);
        HarryP.setPaginas(256);
        HarryP.setCapitulos(17);
        System.out.println("Titulo: " + HarryP.getTitulo());
        System.out.println("Autor: " + HarryP.getAutor());
        System.out.println("Editorial: " + HarryP.getEditorial());
        System.out.println("Tipo: " + HarryP.getTipo());
        System.out.println("Color: " + HarryP.getColor());
        System.out.println("Paginas: " + HarryP.getPaginas());
        System.out.println("Capitulos: " + HarryP.getCapitulos());
        HarryP.actual(39);
        HarryP.opinion("no");
        System.out.println("");

        //Diario de Ana Frank
        Atributos AnaF = new Atributos();
        AnaF.setTitulo("Diario de Ana Frank");
        AnaF.setAutor("Ana Frank");
        AnaF.setEditorial("Contact");
        AnaF.setTipo("Diario personal y autobiografía");
        AnaF.setColor(Color.gray);
        AnaF.setPaginas(215);
        AnaF.setCapitulos(4);
        System.out.println("Titulo: " + AnaF.getTitulo());
        System.out.println("Autor: " + AnaF.getAutor());
        System.out.println("Editorial: " + AnaF.getEditorial());
        System.out.println("Tipo: " + AnaF.getTipo());
        System.out.println("Color: " + AnaF.getColor());
        System.out.println("Paginas: " + AnaF.getPaginas());
        System.out.println("Capitulos: " + AnaF.getCapitulos());
        AnaF.actual(157);
        AnaF.opinion("si");
    }
}