module com.hello.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hello.test to javafx.fxml;
    exports com.hello.test;
}
