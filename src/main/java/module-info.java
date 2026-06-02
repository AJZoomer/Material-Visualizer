module com.ajzoomer.materialvisualiser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.ajzoomer.materialvisualiser to javafx.fxml;
    exports com.ajzoomer.materialvisualiser;
}