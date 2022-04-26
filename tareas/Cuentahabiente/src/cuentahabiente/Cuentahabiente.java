package cuentahabiente;

public class Cuentahabiente {

    private String idCliente;
    private String nombre;
    private int balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String nombre, int balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "-Id del cliente = " + idCliente + "  -Nombre del cliente = " + nombre + "  -Balance = " + balance + "  -Retiro: 30000";
    }

    public void retirarDinero(int monto) {
        System.out.println("Balance actual: " + this.balance);
        this.balance -= monto;
        System.out.println("Balance posterior: " + this.balance);
    }

    public String evaluarNivelCliente() {
        return this.balance - 30000 > 50000 ? "Cliente Premium" : "Cliente Regular";
    }
}
