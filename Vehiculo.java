public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Vehiculo() {
        marca = "";
        modelo = "";
        anio = 0;
        precio = 0.0;
    }

    public void Leer() {
        // TODO: Ingresar los datos del vehiculo
    }

    public void Imprimir() {
        // TODO: Mostrar los datos del vehiculo
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
