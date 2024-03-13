package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    List<Propietario> listaPropietarios= new ArrayList<>();
    List<Usuario> listaUsuario= new ArrayList<>();
    List<VehiculoCarga> listaVehiculoCarga= new ArrayList<>();
    List<VehiculoTransporte> listaVehiculoTransporte= new ArrayList<>();

    public EmpresaTransporte() {
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public List<VehiculoCarga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(List<VehiculoCarga> listaVehiculoCarga) {
        this.listaVehiculoCarga = listaVehiculoCarga;
    }

    public List<VehiculoTransporte> getListaVehiculoTransporte() {
        return listaVehiculoTransporte;
    }

    public void setListaVehiculoTransporte(List<VehiculoTransporte> listaVehiculoTransporte) {
        this.listaVehiculoTransporte = listaVehiculoTransporte;
    }
}
