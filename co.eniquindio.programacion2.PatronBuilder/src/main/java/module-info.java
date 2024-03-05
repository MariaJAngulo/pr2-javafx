module co.eniquindio.programacion2.patronbuilder.patronbuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.eniquindio.programacion2.patronbuilder.patronbuilder to javafx.fxml;
    exports co.eniquindio.programacion2.patronbuilder.patronbuilder;

    opens co.eniquindio.programacion2.patronbuilder.patronbuilder.controller;
    exports co.eniquindio.programacion2.patronbuilder.patronbuilder.controller;

}