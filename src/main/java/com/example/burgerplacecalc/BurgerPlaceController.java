package com.example.burgerplacecalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BurgerPlaceController {

    @FXML
    TextField diameterField1, diameterField2, priceField1, priceField2, countOfMeatballField1, countOfMeatballField2;
    @FXML
    Label resultLabel;

    @FXML
    public void calculate(ActionEvent event) {
        try {
            double diameter1 = Double.parseDouble(diameterField1.getText());
            double price1 = Double.parseDouble(priceField1.getText());
            double countOfMeatball1 = Double.parseDouble(countOfMeatballField1.getText());

            double diameter2 = Double.parseDouble(diameterField2.getText());
            double price2 = Double.parseDouble(priceField2.getText());
            double countOfMeatball2 = Double.parseDouble(countOfMeatballField2.getText());

            double value1 = calculateValue(diameter1, price1);
            double value2 = calculateValue(diameter2, price2);

            if (value1>value2){
                resultLabel.setText("Бургер №1 вигідніше");
            }else if(value1<value2){
                resultLabel.setText("Бургер №2 вигідніше");
            }else
                resultLabel.setText("Коштують однаково");
        } catch (NumberFormatException e) {
            resultLabel.setText("Введіть коректне число цифрами!");
        }
    }

    public double calculateValue(double diameter, double price) {
        double radius = diameter / 2;
        return Math.PI * radius * radius / price;
    }
}