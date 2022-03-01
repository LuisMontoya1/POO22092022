package Libro;

import java.awt.Color;

public class Atributos {

    private String Titulo;
    private String Autor;
    private String Editorial;
    private String Tipo;
    private Color Color;
    private int Paginas;
    private int Capitulos;

    public Atributos() {
    }

    public Atributos(String Titulo, String Autor, String Editorial, String Tipo, Color Color, int Paginas, int Capitulos) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.Tipo = Tipo;
        this.Color = Color;
        this.Paginas = Paginas;
        this.Capitulos = Capitulos;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int Capitulos) {
        this.Capitulos = Capitulos;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public void actual(int paginaAc) {
        System.out.println(this.Titulo + " esta abierto en la pagina " + paginaAc);
    }

    public void opinion(String gusto) {
        System.out.println("El libro " + this.Titulo + " " + gusto + " me gusto");
    }
}
