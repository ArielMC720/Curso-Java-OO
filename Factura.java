public class Factura {
    private int numero;
    private String cliente;
    private double total;

    public Factura() {
        numero = 0;
        cliente = "";
        total = 0.0;
    }

    public void Leer() {
        // TODO: Ingresar los datos de la factura
    }

    public void Imprimir() {
        // TODO: Mostrar los datos de la factura
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCliente() {
        if (cliente.equals("")) {
            return "Error: no tiene el nombre del cliente";
        } else {
            return cliente;
        }
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
