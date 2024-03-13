package co.edu.uniquindio.parcial1fx.mariaangulo.vehiculoapp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VehiculoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TxtPlaca;

    @FXML
    private Button btnAgregarvehiculo;

    @FXML
    private RadioButton btnVehiculoCarga;

    @FXML
    private RadioButton btnVehiculoTranporte;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarvehiculo(ActionEvent event) {

    }

    @FXML
    void onVehiculoCarga(ActionEvent event) {

    }

    @FXML
    void onVehiculoTranporte(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

}

