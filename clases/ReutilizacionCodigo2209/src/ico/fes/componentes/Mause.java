/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author Prueba
 */
public class Mause {
    private String marca;
    private String tipo; //optico / analogico (de bolita) / inalambrico

    public Mause() {
    }

    public Mause(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Mause{" + "marca=" + marca + ", tipo=" + tipo + '}';
    }
    
}
