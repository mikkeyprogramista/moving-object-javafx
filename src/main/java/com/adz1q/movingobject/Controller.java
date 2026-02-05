package com.adz1q.movingobject;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private Button btnRight;

    @FXML
    private Button btnLeft;

    @FXML
    private Button btnTop;

    @FXML
    private Button btnBottom;

    @FXML
    private Circle circle;

    private static final int STEP = 10;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnBottom.setOnAction(e -> {
            if (circle.getLayoutY() < pane.getHeight() - circle.getRadius()) {
                circle.setLayoutY(circle.getLayoutY() + STEP);
            }
        });

        btnTop.setOnAction(e -> {
            if (circle.getLayoutY() > 0 + circle.getRadius()) {
                circle.setLayoutY(circle.getLayoutY() - STEP);
            }
        });

        btnLeft.setOnAction(e -> {
            if (circle.getLayoutX() > 0 + circle.getRadius()) {
                circle.setLayoutX(circle.getLayoutX() - STEP);
            }
        });

        btnRight.setOnAction(e -> {
            if (circle.getLayoutX() < pane.getWidth() - circle.getRadius()) {
                circle.setLayoutX(circle.getLayoutX() + STEP);
            }
        });
    }
}
