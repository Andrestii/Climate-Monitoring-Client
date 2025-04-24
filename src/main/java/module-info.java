module climatemonitor {
    requires javafx.controls;
    requires javafx.fxml;

    opens climatemonitor to javafx.fxml;
    exports climatemonitor;
}
