public class Taller {
    private String nombre;
    private int numero;
    private String fecha;

    public Taller() {
        nombre = "";
        numero = 0;
        fecha = "";
    }

    public void Leer() {
        // TODO:ingresar datos del taller
    }

    public void Imprimir() {
        // TODO: Mostrar los datos del taller
    }

    public String getNombre() {
        if (nombre == "")
            return "Error: no tiene el nombre";
        else
            return nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;

    }
    // add

}
