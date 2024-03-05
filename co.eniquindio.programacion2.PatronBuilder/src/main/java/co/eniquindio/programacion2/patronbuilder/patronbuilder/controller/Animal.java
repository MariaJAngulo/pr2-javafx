package co.eniquindio.programacion2.patronbuilder.patronbuilder.controller;

public class Animal {
    private String nombre;
    private String dieta;
    private String habitad;
    private int numeroDePatas;

    public Animal() {
    }

    public Animal(String nombre, String dieta, String habitad, int numeroDePatas) {
        this.nombre = nombre;
        this.dieta = dieta;
        this.habitad = habitad;
        this.numeroDePatas = numeroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
}
