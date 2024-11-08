module org.crudsylocacar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    //requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.crudsylocacar to javafx.fxml;
    exports org.crudsylocacar;
    exports org.crudsylocacar.controller;
    opens org.crudsylocacar.controller to javafx.fxml;
}