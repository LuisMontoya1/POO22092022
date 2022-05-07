/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Prueba
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue();
        System.out.println(x);
        System.out.println(edad2.shortValue());
        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.");
        // convertir Strings a entero.
        String cadena = "99";
        int altura = Integer.parseInt(cadena);
        altura += 1;
        System.out.println("Altura = " + altura);

        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println(".-.-.-.-.-.-.-.");

        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        Arbol.generandoOxigeno();
        /*
        JOptionPane.showInternalMessageDialog(null, "Hola mundo", "Aqui va el titulo", JOptionPane.INFORMATION_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Hola mundo", "Dame tu edad", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
         */

        // Sin operador ternario 
        int edad3 = 19;
        // validar si es mayor de edad
        String resultado = "";
        if (edad3 < 18) {
            resultado = "Menor de edad";
        } else {
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);

        //Con operador ternario
        //<cond>? <True> : <False>;
        int edad4 = 19;
        String res = "";
        res = edad4 < 18 ? "Menor de edad" : "Mayor de edad, tequila";
        System.out.println(res);

        // version minima
        int edad5 = 18;
        System.out.println(edad5 < 18 ? "Menor de edad 5" : "Ya! el tequila");

        //comparacion or a nivel de bits es dcer
        int val1 = 1;
        int val2 = 5;
        /*
        val1 = 0000...0001;
        val2 = 0000...0010;
         */
        System.out.println(val1 & val2);
        /*
        val1 = 0000...0001;
        or
        val2 = 0000...0010;
        -------------------
               0000...0011 => 3
         */
        int val3 = 1; //0000...0001
        // int val4 <<= val3; 
        // System.out.println(val3 <<=);
        int val4 = 0;
        val4 = val3 << 2;
        System.out.println(val4);

        System.out.println(" ------ ARREGLOS ------ ");
        int[] edades;
        edades = new int[5];
        System.out.println(edades);

        edades[0] = 10;
        System.out.println("La primera edad es: " + edades[0]);

        int[] estaturas = new int[5];
        int[] pesos = {86, 99, 56, 76, 77}; //kilos
        System.out.println(pesos[0]); // 86
        System.out.println(pesos[1]); // 99
        System.out.println(pesos[2]); // 56
        System.out.println(pesos[3]); // 76
        System.out.println(pesos[4]); // 77

        System.out.println(" ----- CON FOR ----- ");
        for (int i = 0; i < pesos.length; i++) {
            System.out.println(pesos[i]);
        }

        System.out.println(" ----- CON FOR INVERSO ----- ");
        for (int j = pesos.length-1; 0 <= j; j--) {
            System.out.println(pesos[j]);
            
            System.out.println("Arreglo de alumnos");
            Alumno[] lista = new Alumno[5];
            lista[0] = new Alumno("99999", 2, 9.0f);
            lista[1] = new Alumno("77777", 2, 7.0f);
            lista[2] = new Alumno("55555", 2, 7.0f);
            lista[3] = new Alumno("88888", 2, 8.0f);
            lista[4] = new Alumno("66666", 2, 6.0f);
            
            for (int i = 0; i < lista.length; i++) {
                Alumno alumno = lista[i];
                System.out.println(alumno.evaluarDesempenio());
            }
            
            //FOR EACH
            System.out.println("Con for each...");
            for (Alumno alumno : lista) {
                System.out.println(alumno.evaluarDesempenio());
            }
            
            ArrayList<Alumno> grupo2209 = new ArrayList<Alumno>();
            grupo2209.add( new Alumno("99999", 2, 9.0f);
            grupo2209.add( new Alumno("88888", 2, 8.0f);
            grupo2209.add( new Alumno("77777", 2, 7.0f);
            grupo2209.add( new Alumno("66666", 2, 6.0f);
            grupo2209.add( new Alumno("55555", 2, 5.0f);
            grupo2209.add( new Alumno("44444", 2, 4.0f);
            
            for (Alumno alumno : grupo2209){
                System.out.println(alumno);
            }
            System.out.println("add con indice");
            grupo2209.add(2, new alumno("81111", 3, 9.9f));
            
            for (Alumno alumno : grupo2209){
                System.out.println(alumno);
            }
            
            Alumno tmp = grupo2209.get(1);
            System.out.println("alumno en index = 1 : " +tmp);
            
            System.out.println("Eliminar el index 3");
            Alumno tmp2 = grupo2209.remove(3);
            System.out.println("Elemento scado = " + tmp2);
            
            for(Alumno alumno: grupo2209) { 
                System.out.println(alumno);
            }
            
            System.out.println("Reemplazar el i-esimo elemnto");
            Alumno tmp3 = grupo2209.set(0, new Alumno("44444", 4, 4.4f));
            System.out.println("El sacado es = " + tmp3);
            
            for (Alumno alumno : grupo2209) { 
                System.out.println(alumno);
            }
            try {
                
            } catch (Exception e) {
            }
            
            System.out.println("Excepciones");
            System.out.println(grupo2209.get(20));
            
        }
        
    }
}
