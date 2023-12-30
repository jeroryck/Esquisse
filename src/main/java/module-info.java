module com.esquisse.esquisse {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires org.antlr.antlr4.runtime;

    opens com.esquisse.esquisse to javafx.fxml;
    exports com.esquisse.esquisse;
}