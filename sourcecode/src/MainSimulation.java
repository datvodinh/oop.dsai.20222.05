import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainSimulation extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Welcome.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Physic Simulation");
        primaryStage.getIcons().add(new Image("img/appIcon.png"));
        Scene scene = new Scene(root, 1280, 700);
        String cssFile = getClass().getResource("/css/style.css").toExternalForm();
        scene.getStylesheets().add(cssFile);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}
