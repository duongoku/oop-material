module uet.api_lesson {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    opens uet.api_lesson to javafx.fxml;
    exports uet.api_lesson;
}