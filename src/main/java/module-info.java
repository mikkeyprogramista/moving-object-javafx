module com.adz1q.movingobject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adz1q.movingobject to javafx.fxml;
    exports com.adz1q.movingobject;
}