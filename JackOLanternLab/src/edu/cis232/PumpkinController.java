package edu.cis232;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class PumpkinController {

    @FXML
    private Circle leftEye;

    @FXML
    private Circle rightEye;

    @FXML
    private Arc mouth;

    @FXML
    private Label label;
    
    boolean leftLit = false;
    boolean rightLit = false;
    boolean mouthLit = false;
    
    @FXML
    void leftEyeClickedListener(MouseEvent event) 
    {
    	leftLit = true;
    	leftEye.setFill(Color.GOLD);
    	
    	showMessage();
    }

    @FXML
    void mouthClickedListener(MouseEvent event) 
    {
    	mouthLit = true;
    	mouth.setFill(Color.GOLD);
    	
    	showMessage();
    }

    @FXML
    void rightEyeClickedListener(MouseEvent event) 
    {
    	rightLit = true;
    	rightEye.setFill(Color.GOLD);
    	
    	showMessage();
    }
    
    @FXML
    void showMessage()
    {
    	if (leftLit && rightLit && mouthLit)
    	{
    		label.setVisible(true);
    	}
    }

}
