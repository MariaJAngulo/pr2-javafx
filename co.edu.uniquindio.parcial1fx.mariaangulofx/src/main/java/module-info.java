module co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp;
    opens co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.controller;
    exports co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.controller;
}