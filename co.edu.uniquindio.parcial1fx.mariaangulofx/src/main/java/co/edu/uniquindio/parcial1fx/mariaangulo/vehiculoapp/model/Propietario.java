package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {
    String nombre;
    String cedula;
    String email;
    String celular;
    Vehiculo vehiculoPrincipal;
    List<Vehiculo> listaVehiculosAsociados= new ArrayList<>();


    public Propietario() {
    }

    public Propietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculoPrincipal, List<Vehiculo> listaVehiculosAsociados) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.vehiculoPrincipal= vehiculoPrincipal;
        this.listaVehiculosAsociados=listaVehiculosAsociados;
    }

    public List<Vehiculo> getListaVehiculosAsociados() {
        return listaVehiculosAsociados;
    }

    public void setListaVehiculosAsociados(List<Vehiculo> listaVehiculosAsociados) {
        this.listaVehiculosAsociados = listaVehiculosAsociados;
    }

    public Vehiculo getVehiculoPrincipal() {
        return vehiculoPrincipal;
    }

    public void setVehiculoPrincipal(Vehiculo vehiculoPrincipal) {
        this.vehiculoPrincipal = vehiculoPrincipal;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
