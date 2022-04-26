package cuentahabiente;

public class PruebaEjemplo {

    public static void main(String[] args) {

        Cuentahabiente[] clientes = new Cuentahabiente[5];
        clientes[0] = new Cuentahabiente("16105963", "Francisco Jose Carrillo", 78000);
        clientes[1] = new Cuentahabiente("78595613", "Jose Miguel Medrano", 146000);
        clientes[2] = new Cuentahabiente("20719607", "Maria Araceli Plasencia", 62000);
        clientes[3] = new Cuentahabiente("98172162", "Juana Maria Ferre", 134000);
        clientes[4] = new Cuentahabiente("83840508", "Carlos Jose Herreros", 93000);
        
        for (Cuentahabiente cuentahabiente : clientes) {
            System.out.println(cuentahabiente);
            System.out.println(cuentahabiente.evaluarNivelCliente());
            System.out.println("");
        }

    }

}
