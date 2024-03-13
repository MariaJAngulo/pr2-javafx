package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.factory;

public class ModelFactory {
    private static ModelFactory modelFactory;

    public ModelFactory() {
    }
    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory= new ModelFactory();
        }
        return modelFactory;
    }
    inicializarDatos();
    return modelFactory;
}
