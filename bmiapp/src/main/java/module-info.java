module com.ptdh.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ptdh.bmiapp to javafx.fxml;
    exports com.ptdh.bmiapp;
}
