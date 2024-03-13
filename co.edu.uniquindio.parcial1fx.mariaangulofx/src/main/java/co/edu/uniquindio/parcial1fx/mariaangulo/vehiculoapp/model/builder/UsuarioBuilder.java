package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model.builder;

import co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model.Usuario;

public class UsuarioBuilder {
    protected String nombre;
    protected String cedula;
    protected int edad;
    public UsuarioBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public UsuarioBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }

    public UsuarioBuilder edad(int edad){
        this.edad = edad;
        return this;
    }

    public Usuario build(){
        return new Usuario(nombre, cedula, edad);
    }
}
