module Fxml {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jasperreports;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires mysql.connector.j;


    exports Fxml;
    exports com.example.foodflow.Controller;
    exports com.example.foodflow.Model;

    opens Fxml to javafx.fxml;
    opens com.example.foodflow.Controller to javafx.fxml;
    opens com.example.foodflow.Model to javafx.base;


}