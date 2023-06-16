module com.example.searchforlib {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.searchforlib to javafx.fxml;
    exports com.example.searchforlib;
}