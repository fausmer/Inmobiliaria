//programa para guardar los datos de cada casa o propiedad de la inmobiliaria
public class Inmobiliaria {
    private int cod;
    private String ubicacion;
    private double precio;
    private String ciudad;
    private int codpos;
    private String disponibilidad;
    public Inmobiliaria(int cod, String ubicacion, double precio, String ciudad, int codpos) {
        this.cod = cod;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.ciudad = ciudad;
        this.codpos = codpos;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodpos() {
        return codpos;
    }

    public void setCodpos(int codpos) {
        this.codpos = codpos;
    }

    public Inmobiliaria(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Inmobiliaria{" +
                "disponibilidad='" + disponibilidad + '\'' +
                '}';
    }
    private boolean Ventas(){
        this.disponibilidad="no disponible";

    }

}
