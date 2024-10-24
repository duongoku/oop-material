package uet.multithread_lesson;

import java.util.concurrent.atomic.AtomicInteger;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.concurrent.Task;

public class HelloController {

    @FXML
    private Label welcomeText;

    private final AtomicInteger count = new AtomicInteger(0);

    // private final volatile int count = 0;

    @FXML
    protected void onHelloButtonClick() {
        String data = fetchDataFromApi();
        welcomeText.setText(data);
    }

    @FXML
    protected void onHelloButtonClickMultiThread() {
        Task<String> task = new Task<>() {
            @Override
            protected String call() {
                return fetchDataFromApi();
            }
        };
        task.setOnSucceeded(e -> welcomeText.setText(task.getValue()));
        new Thread(task).start();
    }

    private String fetchDataFromApi() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count.incrementAndGet();
        return "Data from API: Welcome to JavaFX Application!\nCount: " + count;
    }
}