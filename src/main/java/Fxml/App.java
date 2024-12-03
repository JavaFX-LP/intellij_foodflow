package Fxml ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {

    private static final String ICON_PATH = "/Images/Foodflow.jpg";
    private static final String FXML_PATH = "Document.fxml";
    @Override
    public void start(Stage stage) throws IOException {
        Image icon = new Image(App.class.getResourceAsStream(ICON_PATH));
        stage.getIcons().add(icon);

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(FXML_PATH));
        Scene scene = new Scene(fxmlLoader.load());


        stage.setTitle("FoodFlow");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}