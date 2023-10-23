module com.example.mybot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mybot to javafx.fxml;
    exports com.example.mybot;
}