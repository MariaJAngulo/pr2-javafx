package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.model;

public class VehiculoCarga {
    double capacidadCarga;
    int numeroEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(double capacidadCarga, int numeroEjes) {
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
