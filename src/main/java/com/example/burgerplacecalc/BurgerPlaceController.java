package com.example.burgerplacecalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BurgerPlaceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
