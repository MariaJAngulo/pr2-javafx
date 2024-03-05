package co.eniquindio.programacion2.patronbuilder.patronbuilder.controller;

public class AnimalBuilder {
    protected String Nombre;
    protected String Dieta;
    protected String Habitad;
    protected int NumeroDePatas;

    public AnimalBuilder Nombre(String Nombre){
        this.Nombre=Nombre;
        return this;
    }
    public AnimalBuilder Dieta(String Dieta) {
        this.Dieta = Dieta;
        return this;
    }
    public AnimalBuilder Habitad(String Habitad) {
        this.Habitad = Habitad;
        return this;
    }
    public AnimalBuilder NumeroDePatas(int NumeroDePatas) {
        this.NumeroDePatas = NumeroDePatas;
        return this;
    }
    public Animal build(){
        return new Animal(Nombre, Dieta, Habitad, NumeroDePatas);
    }


}

