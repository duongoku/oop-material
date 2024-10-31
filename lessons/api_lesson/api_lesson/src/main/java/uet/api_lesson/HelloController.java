package uet.api_lesson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField textField;

    private static class Book {
        private String title;
        private String author;
        private String isbn;
        private String description;

        public Book() {
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author.replaceAll("^\"|\"$", "");
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description.replaceAll("^\"|\"$", "");
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn.replaceAll("^\"|\"$", "");
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title.replaceAll("^\"|\"$", "");
        }

        public String toString() {
            return title;
        }
    }

    private Book getBookFromJson(String json) {
        try {
            Book result = new Book();
            JsonNode node = new ObjectMapper().readTree(json);
            if (node.has("items")) {
                JsonNode items = node.get("items");
                JsonNode volumeInfo = items.get(0).get("volumeInfo");
                result.setTitle(String.valueOf(volumeInfo.get("title")));
                result.setAuthor(String.valueOf(volumeInfo.get("authors").get(0)));
                result.setIsbn(String.valueOf(volumeInfo.get("industryIdentifiers").get(0).get("identifier")));
                result.setDescription(String.valueOf(volumeInfo.get("description")));
            }
        return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String getHttpResponse(String url) {
        try (HttpClient client = HttpClient.newHttpClient()) {
            System.out.println("Getting " + url);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
            int status = response.statusCode();
            if (status != 200) {
                throw new RuntimeException("Failed with HTTP error code : " + status);
            }
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Loading...");
        Task<Book> task = new Task<>() {
            @Override
            protected Book call(){
                String api = "https://www.googleapis.com/books/v1/volumes?q=isbn%3D";
                String isbn = textField.getText().trim();
                return getBookFromJson(getHttpResponse(api + isbn));
            }
        };
        task.setOnSucceeded(event -> {
            try {
                String text = "BOOK INFO";
                text += "\nTitle: " + task.get().getTitle();
                text += "\nAuthor: " + task.get().getAuthor();
                text += "\nISBN-13: " + task.get().getIsbn();
                text += "\nDescription: " + task.get().getDescription();
                welcomeText.setText(text);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        new Thread(task).start();
    }
}