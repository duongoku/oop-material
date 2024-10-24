module uet.demo {
  requires javafx.controls;
  requires javafx.fxml;

  opens uet.demo to
      javafx.fxml;

  exports uet.demo;
}
