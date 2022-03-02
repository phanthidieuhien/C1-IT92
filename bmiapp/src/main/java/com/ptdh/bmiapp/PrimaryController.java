package com.ptdh.bmiapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtCC;
    @FXML private TextField txtCN;
    @FXML private Label lbKQ;
    
    public void bmiHandler(ActionEvent event)  {
        double cc = Double.parseDouble(this.txtCC.getText());
        double cn = Double.parseDouble(this.txtCN.getText());
        double KQ = cn / Math.pow(cc, 2);
        if(KQ < 18.5 ) {
            this.lbKQ.setText("gAY");
        } else if(KQ <25)
        {
            this.lbKQ.setText("BTH");
        } else
            this.lbKQ.setText("Map");
        
    }
}
