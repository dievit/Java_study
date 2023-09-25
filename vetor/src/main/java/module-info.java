module com.example.vetor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vetor to javafx.fxml;
    exports com.example.vetor;
}