module org.jvrb.java.conversortemperaturas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.jvrb.java.temp to javafx.fxml;
    exports org.jvrb.java.temp;
}