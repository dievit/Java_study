module com.example.testinglangchain {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testinglangchain to javafx.fxml;
    exports com.example.testinglangchain;
}