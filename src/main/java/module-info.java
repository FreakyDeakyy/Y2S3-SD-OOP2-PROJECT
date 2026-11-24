module com.example.movieapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.movieapplication to javafx.fxml;
    exports com.example.movieapplication;
}