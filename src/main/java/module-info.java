module com.example.burgerplacecalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.burgerplacecalc to javafx.fxml;
    exports com.example.burgerplacecalc;
}