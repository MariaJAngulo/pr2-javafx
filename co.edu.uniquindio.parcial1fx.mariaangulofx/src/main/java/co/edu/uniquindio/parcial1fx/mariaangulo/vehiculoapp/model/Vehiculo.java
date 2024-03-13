package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    String placa;
    String modelo;
    String marca;
    String color;
    Propietario propietarioAsociado;
    List<Propietario> listaPropietariosAsociados= new ArrayList<>();


    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, List<Propietario> listaPropietariosAsociados) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietarioAsociado = propietarioAsociado;
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    public Vehiculo(String placa, String modelo, String marca, String color) {
    }

    public Propietario getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public void setPropietarioAsociado(Propietario propietarioAsociado) {
        this.propietarioAsociado = propietarioAsociado;
    }

    public List<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }

    public void setListaPropietariosAsociados(List<Propietario> listaPropietariosAsociados) {
        this.listaPropietariosAsociados = listaPropietariosAsociados;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
