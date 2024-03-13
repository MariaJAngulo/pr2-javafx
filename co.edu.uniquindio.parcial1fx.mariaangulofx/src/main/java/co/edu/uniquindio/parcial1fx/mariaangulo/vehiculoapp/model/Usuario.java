package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model;

public class Usuario {
    String nombre;
    String cedula;
    int edad;
    VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public Usuario(int edad,VehiculoTransporte vehiculoAsociado, String nombre, String cedula) {
        this.edad = edad;
        this.vehiculoAsociado = vehiculoAsociado;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Usuario(String nombre, String cedula, int edad) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
