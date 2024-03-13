package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model;

import java.util.ArrayList;
import java.util.List;

public class VehiculoTransporte {
    int maximoPasajeros;
    List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(int maximoPasajeros,  List<Usuario> listaUsuariosAsociados) {
        this.maximoPasajeros = maximoPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public List<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(List<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }
}
