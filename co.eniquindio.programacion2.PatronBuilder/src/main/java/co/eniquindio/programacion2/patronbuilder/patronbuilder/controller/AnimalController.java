package co.eniquindio.programacion2.patronbuilder.patronbuilder.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnimalController {

    @FXML
    private Button btnAgregarAnimal;

    @FXML
    private RadioButton btnCarnivoro;

    @FXML
    private RadioButton btnHerbivoro;

    @FXML
    private TextField txtDieta;

    @FXML
    private TextField txtHabitad;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumeroPatas;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarAnimal(ActionEvent event) {
        agregarAnimal();


    }


    private void agregarAnimal() {
        Animal animal = new Animal();
        animal.setNombre(txtNombre.getText());
        animal.setDieta(txtDieta.getText());
        animal.setHabitad(txtHabitad.getText());
        animal.setNumeroDePatas(Integer.parseInt(txtNumeroPatas.getText()));

        if (btnCarnivoro.isSelected()) {
            txtResultado.setText("El animal es Carnivoro por lo tanto su area corresponde a la Nº11 \n" +
                    "\nNombre: " + animal.getNombre() +
                    "\nDieta: " + animal.getDieta() +
                    "\nHabitad: " + animal.getHabitad() +
                    "\nNumero de patas: " + animal.getNumeroDePatas());
        }else if (btnHerbivoro.isSelected()){
            txtResultado.setText("El animal es Herbivoro por lo tanto su area corresponde a la Nº15 \n" +
                    "\nNombre: " + animal.getNombre() +
                    "\nDieta: " + animal.getDieta() +
                    "\nHabitad: " + animal.getHabitad() +
                    "\nNumero de patas: " + animal.getNumeroDePatas());

        }else{
            txtResultado.setText("Por favor realizar la seleccion de los tipos de animales.");
        }
    }
}