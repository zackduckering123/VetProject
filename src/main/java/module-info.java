module com.example.vetproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vetproject to javafx.fxml;
    exports com.example.vetproject;
}